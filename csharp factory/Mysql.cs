using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace csharp_factory
{
    public class Mysql : IDatabase
    {
        public void VeriCek(){
            Console.WriteLine("Mysql'de veri cekme islemi gerceklestirildi.");
        }
        public void VeriEkle(){
            Console.WriteLine("Mysql'de veri ekleme islemi gerceklestirildi.");
        }       
    }
}