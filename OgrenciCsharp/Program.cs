using System;

namespace YTM1
{
    class Program
    {
        static void Main(string[] args)
        {
            Ogrenci ogrenciZeynep = new Ogrenci("Zeynep Merve", "Koyuncu", "yazilim", "of", 427647, 2022, 3);
            Console.WriteLine("Ogrencinin adi: " + ogrenciZeynep.Ad);
            Console.WriteLine("Ogrencinin soyadi: " + ogrenciZeynep.Soyad);
            Console.WriteLine("Ogrencinin numarasi: " + ogrenciZeynep.Numara);

            Ogrenci ogrenci1 = new Ogrenci("Ali", "Yilmaz", "yazilim", "of teknoloji", 1756834, 2022, 1);
            Ogrenci ogrenci2 = new Ogrenci("Veli", "Can", "yazilim", "of teknoloji", 511598, 2022, 1);
            Ogrenci ogrenci3 = new Ogrenci("Deniz", "Demir", "yazilim", "of teknoloji", 298138, 2022, 1);

            Akademisyen akademisyen1 = new Akademisyen("Salih", "Yilmaz");
            Akademisyen akademisyen2 = new Akademisyen("Ayse", "Kara");

            BilgiPaketi bilgiPaketi = new BilgiPaketi();

            TemelDers ders1 = new TemelDers("Fizik", "101", "Guz", false, akademisyen1, 2);
            UygulamaDersi lab1 = new UygulamaDersi("YTM", "301", "Guz", false, akademisyen2, 3);

            bilgiPaketi.DersEkle(ders1);
            bilgiPaketi.DersEkle(lab1);

            ders1.DerseYazilim(ogrenci1);
            ders1.DerseYazilim(ogrenci2);
            ders1.DerseYazilim(ogrenci3);
            lab1.DerseYazilim(ogrenci1);
            lab1.DerseYazilim(ogrenci3);

            ders1.ListeyiYazdir();
            lab1.ListeyiYazdir();

            bilgiPaketi.TranskriptSorgula(ogrenci1);
            bilgiPaketi.TranskriptSorgula(ogrenci2);

            // Console.WriteLine("Cikisi gormek icin bir tusa basin...");
            // Console.ReadKey(); 
        }
    }
}
