using System;

namespace Eticaret2_
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Kullanici ali = new StandartKullanici();
            Kullanici veli = new PremiumKullanici();

            Urun telefon = new Urun("telefon", 3000);
            Urun bilgisayar = new Urun("bilgisayar", 5000);

            ali.AddUrun(telefon);
            ali.AddUrun(bilgisayar);
            veli.AddUrun(telefon);
            veli.AddUrun(bilgisayar);

            Siparis.OdemeYap(ali);
            Siparis.OdemeYap(veli);
        }
    }

}
