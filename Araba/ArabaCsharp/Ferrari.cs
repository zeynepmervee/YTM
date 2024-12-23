using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace YTM
{
    public class Ferrari : Araba, ITurbo, IKlima
    {
        public Ferrari(double var1, double var2) : base(var1, var2){}

        public override void Power(){
            this.acceleration = 10;
        }

        public void Boost(){
            this.acceleration *= 2;
        }

        public void Open(){
            this.acceleration *= 0.9;
        }
    }
}