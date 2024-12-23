using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace csharp_factory
{
    //Mysql factory sınıfı
    public class MysqlYonetici : DBYonetici
    {
        public override IDatabase GetDatabase(){return new Mysql();}
    }
}