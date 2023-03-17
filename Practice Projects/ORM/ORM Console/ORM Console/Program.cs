using ORM_Console;

using (var db = new DatabaseContext())
{

	var product = new Products() { Price = 100, description = "Cup" };
	db.Product.Add(product);
	db.SaveChanges();

	foreach (var p in db.Product)
	{
		Console.WriteLine("{0} {1} {2}", p.Productid, p.description, p.Price);
	}

}