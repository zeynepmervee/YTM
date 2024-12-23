using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace csharp_haber
{
    public class Mail : Iletisim
    {
        public void BilgiGonder(Kullanici kullanici, string mesaj){
            this.MailGonder(kullanici.GetMail(), mesaj);
        }

        public void MailGonder(string mail, string mesaj){
            Console.WriteLine(mail + "adresine " + mesaj + " gonderilmistir.");
        }
    }
}