using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http.Headers;
using System.Text;
using System.Threading.Tasks;

namespace ORM_Console
{
	public class OrderItem
	{
		public int OrderItemId { get; set; }
		public int Quantity { get; set; }
		public virtual Products Product { get; set; }
	}
}
