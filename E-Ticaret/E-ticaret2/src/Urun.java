public class Urun {
    protected int id;
    protected String isim;
    protected double fiyat;

    public Urun(String isim,double fiyat){
        this.isim=isim;
        this.fiyat=fiyat;
    }
    public double getFiyat(){
        return fiyat;
    }
}
