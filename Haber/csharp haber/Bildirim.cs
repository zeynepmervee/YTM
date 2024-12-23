using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace csharp_haber
{
    public class Bildirim : Iletisim
    {
        public void BilgiGonder(Kullanici kullanici, string mesaj){
            this.BildirimGonder(kullanici.GetIp(), mesaj);
        }

        public void BildirimGonder(int ip, string mesaj){
            Console.WriteLine(ip + " adresine " + mesaj + " gonderildi.");
        }
    }
}