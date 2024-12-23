public class Kullanici {
    private String mail,isim;
    private Adres adres;
    public void girisYap(String isim, String mail){
    

    }
    public void adresGuncelle(Adres yadres){
        this.adres.setUlke(yadres.getUlke());
    }


    public String getIsım(){
        return isim;
    }
    public String getMail(){
        return mail;
    }

    public void setIsim(String isim){
        this.isim=isim;
    }
    public void setMail(String mail){
        this.mail=mail;
    }
    public void setAdres(Adres adres){
        this.adres=adres;
    }
    
}
