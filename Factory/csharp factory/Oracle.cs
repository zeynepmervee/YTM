using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace csharp_factory
{
    public class Oracle : IDatabase
    {
        public void VeriCek(){
            Console.WriteLine("Oracle'da veri cekme islemi gerceklestirildi.");
        }
        public void VeriEkle(){
            Console.WriteLine("Oracle'da veri ekleme islemi gerceklestirildi.");
        }
    }
}