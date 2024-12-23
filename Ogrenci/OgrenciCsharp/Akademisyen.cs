using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace YTM1
{
    public class Akademisyen
    {
        private string ad;
        private string soyad;

        public Akademisyen(string ad, string soyad)
        {
            this.ad = ad;
            this.soyad = soyad;
        }

        public string Ad
        {
            get { return ad; }
        }

        public string Soyad
        {
            get { return soyad; }
        }
    }

}

