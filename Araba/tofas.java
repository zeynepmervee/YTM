public class tofas extends araba implements IKlima{
    public tofas(double var1, double var2){
        super(var1, var2);
    }

    public void power(){
        this.acceleration = 5;
    }

    public void open(){
        this.acceleration *= 0.9;
    }
}
