namespace Api_for_Research_Report
{
	public class Client
	{
		public String ConnectionId { get; set; }
		public int Calls { get; set; }

		public Client(string connectionId, int calls)
		{
			ConnectionId = connectionId;
			Calls = calls;
		}
	}
}
