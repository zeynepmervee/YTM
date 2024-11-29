public class Ogrenci {
    private String ad,soyad,bolum,fakulte;      
    private int numara,girisYili,sinif;
   


    public Ogrenci(String ad,String soyad,String bolum, String fakulte,int numara, int girisYili,int sinif){
        this.ad=ad;
        this.soyad=soyad;
        this.bolum=bolum;
        this.fakulte=fakulte;
        this.numara=numara;
        this.girisYili=girisYili;
        this.sinif=sinif;
        
    }

 
    public String getAd(){
        return ad;
    }
    public String getSoyad(){
        return soyad;
    }
    public String getBolum(){
        return bolum;
    }
    public String getFakulte(){
        return fakulte;
    }
    public int getNumara(){
        return numara;
    }
    public int getGirisYili(){
        return girisYili;
    }
    public int getSinif(){
        return sinif;
    }

    public void setAd(String ad){
        this.ad=ad;
    }
    public void setSoyadd(String soyad){
        this.soyad=soyad;
    }
    public void setBolum(String bolum){
        this.bolum=bolum;
    }
    public void setFakulte(String fakulte){
        this.fakulte=fakulte;
    }
    public void setNumara(int numara){
        this.numara=numara;
    }
    public void setGirisYili(int girisYili){
        this.girisYili=girisYili;
    }
    public void setSinif(int sinif){
        this.sinif=sinif;
    }
    

}
