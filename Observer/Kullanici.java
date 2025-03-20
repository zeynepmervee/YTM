public class Kullanici extends ATakipEdilen implements ITakipci {
    public Kullanici(String isim,String mail){
        super(isim);
    }
    private String mail;
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    private String isim;
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getMail() {
        return mail;
    }
    
    public void paylas(Post post){
        System.out.println(getIsim() + "kullanici");
        tumunuBilgilendir(post);
    }
    
    public void Bilgilendir(Post post){
        System.out.println(getIsim() + "kullanici");
    }
}
