using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace YTM1
{
    public class Ogrenci
    {
        private string ad, soyad, bolum, fakulte;
        private int numara, girisYili, sinif;

        public Ogrenci(string ad, string soyad, string bolum, string fakulte, int numara, int girisYili, int sinif)
        {
            this.ad = ad;
            this.soyad = soyad;
            this.bolum = bolum;
            this.fakulte = fakulte;
            this.numara = numara;
            this.girisYili = girisYili;
            this.sinif = sinif;
        }

        public string Ad
        {
            get { return ad; }
            set { ad = value; }
        }

        public string Soyad
        {
            get { return soyad; }
            set { soyad = value; }
        }

        public string Bolum
        {
            get { return bolum; }
            set { bolum = value; }
        }

        public string Fakulte
        {
            get { return fakulte; }
            set { fakulte = value; }
        }

        public int Numara
        {
            get { return numara; }
            set { numara = value; }
        }

        public int GirisYili
        {
            get { return girisYili; }
            set { girisYili = value; }
        }

        public int Sinif
        {
            get { return sinif; }
            set { sinif = value; }
        }
    }

}
