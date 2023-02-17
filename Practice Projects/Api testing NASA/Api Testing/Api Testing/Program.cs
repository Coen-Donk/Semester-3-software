using System;

namespace Api_Testing
{
	internal class Program
	{
		static void Main(string[] args)
		{
			Nasa_API Api = new Nasa_API();
			while (true)
			{
				string ODate;
				string OName;

				Console.WriteLine("Awaiting Date");
				ODate = Console.ReadLine();
				Console.WriteLine("Awaiting Name");
				OName = Console.ReadLine();


				var NasaList = Api.GetList(ODate, OName.ToUpper());

				Console.WriteLine(NasaList.Result);
				Console.ReadLine();
			}
		}
	}
}
