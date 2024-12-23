using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace csharp_haber
{
    public interface Iletisim
    {
        void BilgiGonder(Kullanici kullanici, string mesaj);
    }
}