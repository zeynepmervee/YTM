using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Eticaret2_
{
    public class Siparis
    {
        public static void OdemeYap(Kullanici kullanici)
        {
            double toplamTutar = 0;

            foreach (Urun urun in kullanici.GetUrunler())
            {
                toplamTutar += urun.GetFiyat();
            }

            toplamTutar = kullanici.GetToplamTutar(toplamTutar);

            System.Console.WriteLine(kullanici.GetType().Name + " Toplam Tutar = " + toplamTutar);
        }
    }

}
