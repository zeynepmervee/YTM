
import java.util.ArrayList;
import java.util.List;

public abstract class Kullanici {
    protected int id;
    private String isim,mail;
    protected List<Urun> urunler;

    public void Kullanici(){
        urunler=new ArrayList<Urun>();
    }
    public abstract double getToplamTutar(double fiyat);
    public String getIsim(){
        return isim;
    }
    public List<Urun> getUrunler(){
        return urunler;
    }
    public void addUrun(Urun urun){
        getUrunler().add(urun);
    }
    public void OdemeYap(){

    }

}

