using InfrastructureDb;
using Microsoft.EntityFrameworkCore;

namespace DatabaseApi.Services
{
	public class UserService
	{
		private DatabaseContext context;

		public UserService(DatabaseContext Context) 
		{
			context = Context;
		}

		public Users GetUser(string username)
		{
			return context.Users.FirstOrDefault(x => x.UserName.ToUpper() == username.ToUpper());
		}

		public void AddUser(string Username, string Password)
		{
			var user = new Users() { UserName = Username, Password = Password};
			context.Users.Add(user);
			context.SaveChanges();
		}

		public void RemoveUser(string Username) 
		{ 
			var user = context.Users.FirstOrDefault(x => x.UserName == Username);
			if (user != null)
			{
				context.Users.Remove(user);
				context.SaveChanges();
			}
		}	
	}
}
