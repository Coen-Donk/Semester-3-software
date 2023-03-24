using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ORM_Console
{
	public class Users
	{
		[Key]
		public int UserId { get; set; }
		public string FirstName { get; set; }
		public string Lastname { get; set; }
	}
}
