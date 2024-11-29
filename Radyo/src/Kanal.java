public class Kanal {
    private String isim, link;
    public Kanal (String isim,String link){
        setIsim(isim);
        setLink(link);
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getIsim() {
        return isim;
    }

    public String getLink() {
        return link;
    }

    
}
