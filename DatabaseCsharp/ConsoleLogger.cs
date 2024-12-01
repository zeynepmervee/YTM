using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace csharp__2
{
    public class ConsoleLogger : ILogger
    {
        public void Write(String message){
            Console.WriteLine(message);
        }
    }
}