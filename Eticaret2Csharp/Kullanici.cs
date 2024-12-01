using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Eticaret2_
{
    using System.Collections.Generic;

    public abstract class Kullanici
    {
        protected int id;
        protected string isim;
        protected string mail;
        protected List<Urun> urunler;

        public Kullanici()
        {
            urunler = new List<Urun>();
        }

        public abstract double GetToplamTutar(double fiyat);

        public string GetIsim()
        {
            return isim;
        }

        public List<Urun> GetUrunler()
        {
            return urunler;
        }

        public Urun GetUrun(int index)
        {
            return GetUrunler()[index];
        }

        public void AddUrun(Urun urun)
        {
            GetUrunler().Add(urun);
        }
    }

}
