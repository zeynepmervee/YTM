using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace csharp__2
{
    public class Program
    {
        public static void Main(string[] args)
        {
            DbLogger dbLogger = new DbLogger();
            ConsoleLogger consoleLogger = new ConsoleLogger();

            dbLogger.Write("log 1");

            dbLogger.OpenConnection();
            dbLogger.Write("log 2");
            consoleLogger.Write("log 3");
            dbLogger.Write("log 4");
            dbLogger.CloseConnection();

            dbLogger.Write("log 5");

            foreach (string message in dbLogger.Database.GetList()){
                Console.WriteLine(message);
            }
        }
    }
}
