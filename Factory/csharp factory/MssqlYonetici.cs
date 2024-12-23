using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace csharp_factory
{
    //Mssql factory sınıfı
    public class MssqlYonetici : DBYonetici
    {
        public override IDatabase GetDatabase(){return new Mssql();}
    }
}