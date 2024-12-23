public class TemelDers extends Ders{
    public TemelDers(String dersAdi,String dersKodu,String donem, boolean secmeli,Akademisyen dersSorumlusu, int kredi){
        super(dersAdi, dersKodu, donem, secmeli, dersSorumlusu, kredi);
      
    }

    @Override
    public String notHesapla(double... notlar){
        if(notlar.length!=3){
            throw new IllegalArgumentException("Temel dersler icin 3 not girilmelidir (Vize, Final, Proje).");
        }
        double ortalama=(notlar[0]*0.3)+(notlar[1]*0.5)+(notlar[2]*0.2);
        return super.harfNotu(ortalama);
       
    }
}