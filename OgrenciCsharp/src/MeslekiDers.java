public class MeslekiDers extends Ders{
    public MeslekiDers(String dersAdi,String dersKodu,String donem, boolean secmeli,Akademisyen dersSorumlusu, int kredi){
        super(dersAdi, dersKodu, donem, secmeli, dersSorumlusu, kredi);
    }

        @Override
        public String notHesapla(double... notlar){
            if(notlar.length!=1){
                throw new IllegalArgumentException("Mesleki egitim dersleri icin 1 not girilmelidir.");

            }
            return super.harfNotu(notlar[0]);

        }
    
}
