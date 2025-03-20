import java.util.ArrayList;

public abstract class ATakipEdilen {
    private ArrayList<ITakipci> takipciListesi;
    private String isim;
    public ATakipEdilen(String x){}

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void takipciEkle(ITakipci takipci){
        takipciListesi.add(takipci);
    }
    public void takipciCikar(ITakipci takipci){
        takipciListesi.remove(takipci);
    }

    public void tumunuBilgilendir(Post post){
        for(ITakipci takipci:takipciListesi){
            takipci.Bilgilendir(post);
        }
    }
    public abstract void paylas(Post post);


}