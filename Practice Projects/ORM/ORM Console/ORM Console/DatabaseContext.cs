using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;

namespace ORM_Console
{
	public class DatabaseContext : DbContext
	{
		public DbSet<Order> Orders { get; set; }
		public DbSet<OrderItem> Items { get; set; }
		public DbSet<Products> Product { get; set; }

		protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
		{
			optionsBuilder.UseSqlite("Data Source=F:\\2022-2023\\Semester 3 Software\\Semester-3-software\\Practice Projects\\ORM\\ORM Console\\ORM Console\\database.db");
		}
	}
}
