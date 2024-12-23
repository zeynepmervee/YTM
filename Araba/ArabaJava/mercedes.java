public class mercedes extends araba implements ITurbo {
    public mercedes(double var1, double var2){
        super(var1, var2);
    }

    public void power(){
        this.acceleration = 7;
    }

    public void boost(){
        this.acceleration *= 2;
    }
}
