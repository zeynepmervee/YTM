using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace csharp_factory
{
    //Abstract factory sınıfı
    public abstract class DBYonetici
    {
        public abstract IDatabase GetDatabase();      
    }
}