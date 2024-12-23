using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace csharp_haber
{
    public class Kullanici
    {
        private string isim, mail;
        private int ip, tel;

        public Kullanici(string isim, string mail, int ip, int tel){
            this.isim = isim;
            this.mail = mail;
            this.ip = ip;
            this.tel = tel;
        }

        public string GetIsim(){return this.isim;}
        public string GetMail(){return this.mail;}
        public int GetIp(){return this.ip;}
        public int GetTel(){return this.tel;}

        public void SetIsim(string isim){this.isim = isim;}
        public void SetMail(string mail){this.mail = mail;}
        public void SetIp(int ip){this.ip = ip;}
        public void SetTel(int tel){this.tel = tel;}
    }
}