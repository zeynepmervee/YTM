using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace YTM1
{
    public class UygulamaDersi : Ders
    {
        public UygulamaDersi(string dersAdi, string dersKodu, string donem, bool secmeli, Akademisyen dersSorumlusu, int kredi)
            : base(dersAdi, dersKodu, donem, secmeli, dersSorumlusu, kredi)
        {
        }

        public override string NotHesapla(params double[] notlar)
        {
            if (notlar.Length != 2)
            {
                throw new ArgumentException("Uygulamalı dersler için 2 not girilmelidir (vize, final).");
            }

            double ortalama = (notlar[0] * 0.4) + (notlar[1] * 0.6);
            return HarfNotu(ortalama);
        }
    }

}
