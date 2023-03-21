using Microsoft.AspNetCore.Mvc;

namespace Api_for_Research_Report.Controllers
{
	[ApiController]
	[Route("[controller]")]
	public class WeatherForecastController : ControllerBase
	{
		private static readonly string[] Summaries = new[]
		{
		"Freezing", "Bracing", "Chilly", "Cool", "Mild", "Warm", "Balmy", "Hot", "Sweltering", "Scorching"
	};

		private readonly ILogger<WeatherForecastController> _logger;

		Dummy calls = new Dummy();

		public WeatherForecastController(ILogger<WeatherForecastController> logger)
		{
			_logger = logger;
		}

		[HttpGet(Name = "GetDummy")]
		public List<Client> GetDummy()
		{
				
				return calls.GetCalls(HttpContext.Connection.Id);
		}
	}
}