using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace csharp_factory
{
    //Oracle factory sınıfı
    public class OracleYonetici : DBYonetici
    {
        public override IDatabase GetDatabase(){return new Oracle();}
    }
}