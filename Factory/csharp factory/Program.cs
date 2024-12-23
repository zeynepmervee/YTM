using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace csharp_factory
{
    public class Program
    {
        public static void Main(string[] args)
        {
            MysqlYonetici mySqlYonetici = new MysqlYonetici();
            IDatabase mySql = mySqlYonetici.GetDatabase();
            mySql.VeriCek();
            mySql.VeriEkle();

            MssqlYonetici mssqlYonetici = new MssqlYonetici();
            IDatabase msSql = mssqlYonetici.GetDatabase();
            msSql.VeriCek();
            msSql.VeriEkle();

            OracleYonetici oracleYonetici = new OracleYonetici();
            IDatabase oracle = oracleYonetici.GetDatabase();
            oracle.VeriCek();
            oracle.VeriEkle();
        }
    }
}