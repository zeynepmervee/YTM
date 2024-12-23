public class Kullanici {
    private String isim;
    private String mail;
    private int ip;
    private int tel;

    public Kullanici(String isim, String mail, int ip, int tel){
        this.isim = isim;
        this.mail = mail;
        this.ip = ip;
        this.tel = tel;
    }

    public void setIsim(String isim){this.isim = isim;}
    public void setMail(String mail){this.mail = mail;}
    public void setIp(int ip){this.ip = ip;}
    public void setTel(int tel){this.tel = tel;}

    public String GetIsim(){return this.isim;}
    public String GetMail(){return this.mail;}
    public int GetIp(){return this.ip;}
    public int GetTel(){return this.tel;}
}

