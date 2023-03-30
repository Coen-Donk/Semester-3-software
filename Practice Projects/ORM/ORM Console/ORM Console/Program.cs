using ORM_Console;

using (var db = new DatabaseContext())
{

	var product = new Products() { Price = 100, description = "Cup" };

	var user = new Users() { FirstName = "rob", Lastname = "van der steen" };
	db.Users.Add(user);
	db.SaveChanges();

	foreach (var p in db.Orders)
	{
		Console.WriteLine("{0} {1} {2}", p.Id , p.Created , p.Items);
	}

}