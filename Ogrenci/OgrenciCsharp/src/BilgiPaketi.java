import java.util.List;
import java.util.ArrayList;

public class BilgiPaketi{

private List<Ders> tumDersler;    

public BilgiPaketi(){
    tumDersler =new ArrayList<>();
}

public void dersEkle(Ders ders){
    tumDersler.add(ders);
}

public void transkriptSorgula(Ogrenci ogrenci){
    for(Ders ders:tumDersler){         
        if(ders.ogrenciKayitliMi(ogrenci.getNumara())){    
            System.out.println(ogrenci.getAd()+" "+ogrenci.getSoyad()+" adli ogrencinin transkripti:");
            System.out.println(ders.dersAdi+" dersi: ");
            System.out.println("Dersin kredisi: "+ders.kredi);
            System.out.println("Harf notu: "+ders.harfNotu(0));

        }
    }
}

}