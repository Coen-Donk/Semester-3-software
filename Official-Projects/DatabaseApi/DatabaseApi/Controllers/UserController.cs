using DatabaseApi.Services;
using InfrastructureDb;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore.Storage;

// For more information on enabling Web API for empty projects, visit https://go.microsoft.com/fwlink/?LinkID=397860

namespace DatabaseApi.Controllers
{
	[Route("api/[controller]")]
	[ApiController]
	public class UserController : ControllerBase
	{
		static DatabaseContext Db = new DatabaseContext();
		UserService userService = new UserService(Db);

		// GET: api/<UserController>
		[HttpGet("{Username}")]
		public ActionResult<Users> Get(string Username)
		{
			var users = userService.GetUser(Username);
			return users;
		}

		// POST api/<UserController>
		[HttpPost]
		public void AddUser(string Username, string Password)
		{
			userService.AddUser(Username, Password);
		}

		// PUT api/<UserController>/5
		[HttpPut("{id}")]
		public void Put(int id, [FromBody] string value)
		{

		}

		// DELETE api/<UserController>/5
		[HttpDelete("{username}")]
		public void RemoveUser(string username)
		{
			userService.RemoveUser(username);
		}
	}
}
