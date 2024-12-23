using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Eticaret2_
{
    public class StandartKullanici : Kullanici
    {
        public override double GetToplamTutar(double fiyat)
        {
            return fiyat;
        }
    }

}
