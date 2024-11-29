public class Adres {
    private String il,ulke,ilce;
    private int postKodu;

    public void setIl(String il){
        this.il=il;
    }
    public void setUlke(String ulke){
        this.ulke=ulke;
    }
    public void setIlce(String ilce){
        this.ilce=ilce;
    }
    public void setPostKodu(int postKodu){
        this.postKodu=postKodu;
    }
    public String getIl(){
        return il;
    }
    public String getUlke(){
        return ulke;
    }
    public String getIlce(){
        return ilce;
    }
    public int getPostKodu(){
        return postKodu;
    }
  
    public String toString(){
    return getUlke()+" "+getIl()+" "+getIlce()+" "+getPostKodu();
    }
    
}
