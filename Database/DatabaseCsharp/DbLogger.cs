using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace csharp__2
{
    public class DbLogger : ILogger, IConnection
    {
        public Database Database { get; private set; }

        public DbLogger(){
            Database = new Database();
        }

        public void Write(String message){
            Database.AddLog(message);
        }
        public void OpenConnection(){
            Database.OpenDatabase();
        }

        public void CloseConnection(){
            Database.CloseDatabase();
        }
    }    
}