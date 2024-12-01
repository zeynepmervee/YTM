public class ferrari extends araba implements IKlima, ITurbo{
    public ferrari(double var1, double var2){
        super(var1, var2);
    }

    public void power(){
        this.acceleration = 10;
    }

    public void boost(){
        this.acceleration *= 2;
    }

    public void open(){
        this.acceleration *= 0.9;
    }
}
