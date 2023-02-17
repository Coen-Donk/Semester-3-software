

Console.WriteLine("Hello, World!");
string name = Console.ReadLine();
Message(CreateTitan(name));
Message(CreateShifter2(name));
CreateShifter(name);


void Message(Task<string> message)
{
    Console.WriteLine(Convert.ToString(message));
}



async Task<string> CreateTitan(string name)
{
    return await Task.Run(() =>
    {
            string newtitan = name + "Titan";
            Task.Delay(3000).Wait();

            return newtitan += " is made";
    });
}

static string CreateShifter(string name)
{
        for (int i = 0; i < 10; i++)
        {

            string shifter = name;

            Task.Delay(500).Wait();

        return shifter += " This is Static Shifter";
        }
    return name;
}

async Task<string> CreateShifter2(string name)
{
    return await Task.Run(() =>
    {
        for (int i = 0; i < 10; i++)
        {

            string shifter = name;

            Task.Delay(700).Wait();

            return shifter += " this is shifter await";
        }
        return name;
    });
}




