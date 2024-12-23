using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace csharp__2
{
    public interface IConnection
    {
        public  void OpenConnection();
        public  void CloseConnection(); 
    }
}