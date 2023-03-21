using System.Text.Json.Serialization;
using Microsoft.AspNetCore.SignalR;
using Newtonsoft.Json;

namespace Api_for_Research_Report
{
    public class Dummy
    {
		string JSONpath = "F:\\2022-2023\\Semester 3 Software\\Semester-3-software\\Practice Projects\\Api for Research Report\\Api for Research Report\\Calls.json";

		public List<Client> GetCalls(string connectionid)
        {
			List<Client> clients = new List<Client>();
			if (File.Exists(JSONpath) && new FileInfo(JSONpath).Length > 0)
			{
				clients = JsonConvert.DeserializeObject<List<Client>>(File.ReadAllText(JSONpath));
			}


			clients.Add(new Client("empty", 0));
			for (int i = clients.Count - 1; i >= 0; i--)
			{
				Client client = clients[i];
				if (client.ConnectionId == connectionid)
				{
					client.Calls++;
				}
				if(client.ConnectionId == "empty")
				{
					clients.RemoveAt(i);
				}
				
				bool connectionIdExists = clients.Any(c => c.ConnectionId == connectionid);
				if (!connectionIdExists)
				{
					clients.Add(new Client(connectionid, 1));
				}
	
			}
			File.WriteAllText(JSONpath, JsonConvert.SerializeObject(clients));

		return clients;
		}
    }
}
