using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace csharp_haber
{
    public class Haber
    {
        private Bildirim bildirim;
        private Mail mail;
        private List<Iletisim> iletisimListesi;

        public Haber(){
            iletisimListesi = new List<Iletisim>();
            mail = new Mail();
            bildirim = new Bildirim();
            iletisimListesi.Add(mail);
            iletisimListesi.Add(bildirim);
        }

        public void Bilgilendir(Kullanici kullanici, string mesaj){
            foreach (Iletisim iletisim in iletisimListesi){
                iletisim.BilgiGonder(kullanici, mesaj);
            }
        }
    }
}