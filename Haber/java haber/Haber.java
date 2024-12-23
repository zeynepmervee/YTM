import java.util.ArrayList;
import java.util.List;

public class Haber {
    private Mail mail;
    private Bildirim bildirim;
    private List<Iletisim> iletisimListesi;

    public Haber(){
        iletisimListesi = new ArrayList<>();
        mail = new Mail();
        bildirim = new Bildirim();
        iletisimListesi.add(bildirim);
        iletisimListesi.add(mail);

    }

    public void bilgilendir(Kullanici kullanici, String mesaj){
        for (Iletisim iletisim : iletisimListesi) {
            iletisim.bilgiGonder(kullanici, mesaj);
        }
    }
    
}
