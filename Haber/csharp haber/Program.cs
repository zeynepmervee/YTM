using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace csharp_haber
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Kullanici kullanici = new Kullanici("Ozge", "ozge@gmail.com", 111, 0000);
            Haber haber = new Haber();
            haber.Bilgilendir(kullanici, "deneme mesaji");
        }
    }
}
