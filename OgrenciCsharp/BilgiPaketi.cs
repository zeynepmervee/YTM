using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace YTM1
{
    using System;
    using System.Collections.Generic;

    public class BilgiPaketi
    {
        private List<Ders> tumDersler;

        public BilgiPaketi()
        {
            tumDersler = new List<Ders>();
        }

        public void DersEkle(Ders ders)
        {
            tumDersler.Add(ders);
        }

        public void TranskriptSorgula(Ogrenci ogrenci)
        {
            foreach (Ders ders in tumDersler)
            {
                if (ders.OgrenciKayitliMi(ogrenci.Numara))
                {
                    Console.WriteLine(ogrenci.Ad + " " + ogrenci.Soyad + " adlı öğrencinin transkripti:");
                    Console.WriteLine(ders.dersAdi + " dersi:");
                    Console.WriteLine("Dersin kredisi: " + ders.kredi);
                    Console.WriteLine("Harf notu: " + ders.HarfNotu(0));

                }
            }
        }

    }
}
