using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Eticaret2_
{
    public class Urun
    {
        protected int id;
        protected string isim;
        protected double fiyat;

        public Urun(string isim, double fiyat)
        {
            this.isim = isim;
            this.fiyat = fiyat;
        }

        public double GetFiyat()
        {
            return fiyat;
        }
    }

}
