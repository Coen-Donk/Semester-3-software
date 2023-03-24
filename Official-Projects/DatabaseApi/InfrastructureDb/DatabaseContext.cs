using Microsoft.EntityFrameworkCore;

namespace InfrastructureDb
{
	public class DatabaseContext : DbContext
	{
		public DbSet<Users> Users { get; set; }

		protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
		{
			optionsBuilder.UseSqlite("Data source=../InfrastructureDb/Database.db");
		}
	}
}