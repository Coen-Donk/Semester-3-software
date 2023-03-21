using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ORM_Console
{
	public class Products
	{
		[Key]
		public int Productid { get; set; }
		public double Price { get; set; }
		public string description { get; set; }
	}
}
