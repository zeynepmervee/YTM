public abstract class araba {
    protected double acceleration;
    protected double velocity;
    
    public araba(double acceleration, double velocity){
        this.acceleration = acceleration;
        this.velocity = velocity;
    }

    public double getAcceleration(){return this.acceleration;}
    public double getVelocity(){return this.velocity;}
    public void setAcceleration(double acceleration){this.acceleration = acceleration;}
    public void setVelocity(double velocity){this.velocity = velocity;}

    public abstract void power();
    public void run(){
        this.velocity += this.acceleration;
    }
}
