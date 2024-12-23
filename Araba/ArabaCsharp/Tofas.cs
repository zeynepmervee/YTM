using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace YTM
{
    public class Tofas : Araba, IKlima
    {
        public Tofas(double var1, double var2) : base(var1, var2){}

        public override void Power(){
            this.acceleration = 5;
        }

        public void Open(){
            this.acceleration *= 0.9;
        }
    }
}