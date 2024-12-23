using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace YTM
{
    public abstract class Araba
    {
        protected double acceleration;
        protected double velocity;
        
        public Araba(double acceleration, double velocity){
            this.acceleration = acceleration;
            this.velocity = velocity;
        }

        public double GetAcceleration(){return this.acceleration;}
        public double GetVelocity(){return this.velocity;}
        public void SetAcceleration(double acceleration){this.acceleration = acceleration;}
        public void SetVelocity(double velocity){this.velocity = velocity;}

        public abstract void Power();
        public void Run(){
            this.velocity += this.acceleration;
        }
    }
}