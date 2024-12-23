using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace YTM1
{
    public class TemelDers : Ders
    {
        public TemelDers(string dersAdi, string dersKodu, string donem, bool secmeli, Akademisyen dersSorumlusu, int kredi)
            : base(dersAdi, dersKodu, donem, secmeli, dersSorumlusu, kredi)
        {
        }

        public override string NotHesapla(params double[] notlar)
        {
            if (notlar.Length != 3)
            {
                throw new ArgumentException("Temel dersler için 3 not girilmelidir (Vize, Final, Proje).");
            }

            double ortalama = (notlar[0] * 0.3) + (notlar[1] * 0.5) + (notlar[2] * 0.2);
            return HarfNotu(ortalama);
        }
    }

}
