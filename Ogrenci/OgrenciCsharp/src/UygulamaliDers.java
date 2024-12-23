public class UygulamaliDers extends Ders{
    public UygulamaliDers(String dersAdi,String dersKodu,String donem, boolean secmeli,Akademisyen dersSorumlusu, int kredi){
        super(dersAdi, dersKodu, donem, secmeli, dersSorumlusu, kredi);
    }

    @Override
    public String notHesapla(double... notlar){
        if(notlar.length!=2){
            throw new IllegalArgumentException("Uygulamali dersler icin 2 not girilmelidir(vize,final).");  
        }
        double ortalama = (notlar[0] * 0.4) + (notlar[1] * 0.6);
        return super.harfNotu(ortalama);
    }
}
