public class Siparis {
    public static void odemeYap(Kullanici kullanici){
        double toplamTutar=0;
        for (Urun urun : kullanici.getUrunler())
        toplamTutar +=urun.getFiyat();

        toplamTutar=kullanici.getToplamTutar(toplamTutar);

        System.out.println(kullanici.getClass().getSimpleName() + "Toplam Tutar= " + toplamTutar);
    }
}
