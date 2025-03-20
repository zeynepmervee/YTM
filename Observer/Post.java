public class Post {
    private String baslik,icerik;
    private ATakipEdilen takipEdilen;

    public Post(String baslik,String icerik,ATakipEdilen takipEdilen){
        setBaslik(baslik);
        setIcerik(icerik);
        setTakipEdilen(takipEdilen);
    }
    public String getBaslik() {
        return baslik;
    }
    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }
    public String getIcerik() {
        return icerik;
    }
    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }
    public ATakipEdilen getTakipEdilen() {
        return takipEdilen;
    }
    public void setTakipEdilen(ATakipEdilen takipEdilen) {
        this.takipEdilen = takipEdilen;
    }
    
}
