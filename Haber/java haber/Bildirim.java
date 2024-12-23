public class Bildirim implements Iletisim {
    @Override
    public void bilgiGonder(Kullanici kullanici, String mesaj){
        this.bildirimGonder(kullanici.GetIp(), mesaj);
    }

    public void bildirimGonder( int ip, String mesaj){
        System.out.println(ip + " adresine " + mesaj + " gonderilmistir.");
    }
}
