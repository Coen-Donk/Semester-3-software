using System;
using System.Net.Http;
using System.Threading.Tasks;

namespace Api_Testing
{
	internal class Nasa_API
	{
		public async Task<string> GetList(string ODate, string OName)
		{
			using (var Client = new HttpClient())
			{
				try
				{ 
					Client.BaseAddress = new Uri("https://ssd-api.jpl.nasa.gov/");

					HttpResponseMessage response = await Client.GetAsync("nhats.api?des=" + ODate + " " + OName);

					if (response.IsSuccessStatusCode)
					{
						string content = await response.Content.ReadAsStringAsync();

						return content;
					}
					else
					{

						return "Api request failed with status code: " + response.StatusCode; 
					}
				}
				catch (Exception e)
				{
					return "An error occured: " + e.Message;
				}
			}
		}
	}
}
