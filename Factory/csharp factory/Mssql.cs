using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace csharp_factory
{
    public class Mssql : IDatabase
    {
        public void VeriCek(){
            Console.WriteLine("Mssql'de veri cekme islemi gerceklestirildi.");
        }
        public void VeriEkle(){
            Console.WriteLine("Mssql'de veri ekleme islemi gerceklestirildi.");
        }        
    }
}