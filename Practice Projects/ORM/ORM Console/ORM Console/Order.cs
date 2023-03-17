using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ORM_Console
{
	public class Order
	{
		public int Id { get; set; }
		public DateTime Created { get; set; }
		public ICollection<OrderItem> Items { get; set; }
	}
}
