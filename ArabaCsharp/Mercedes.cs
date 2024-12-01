using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace YTM
{
    public class Mercedes : Araba, ITurbo
    {
        public Mercedes(double var1, double var2) : base(var1, var2){}

        public override void Power(){
            this.acceleration = 7;
        }

        public void Boost(){
            this.acceleration *= 2;
        }
    }
}