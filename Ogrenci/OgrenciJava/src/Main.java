public class Main {
    public static void main(String[] args){
        Ogrenci ogrenciZeynep=new Ogrenci("Zeynep Merve","Koyuncu","yazilim","of teknoloji",427647,2022,3);
        System.out.println("ogrencinin adi: "+ogrenciZeynep.getAd());
        System.out.println("ogrencinin soyadi: "+ogrenciZeynep.getSoyad());
        System.out.println("ogrencinin numarasi:"+ogrenciZeynep.getNumara());

        Ogrenci ogrenci1 = new Ogrenci("Feyyaz", "Ceylan", "Veterinerlik", "auvet",1756834, 2019, 5);
        Ogrenci ogrenci2= new Ogrenci("Mustafa","Kemal","yazilim","of teknoloji",298138,2024,1);
        
        Akademisyen akademisyen1=new Akademisyen("ad1","soyad1");
        Akademisyen akademisyen2=new Akademisyen("ad2","soyad2");

        
        BilgiPaketi bilgiPaketi = new BilgiPaketi();

        TemelDers ders1 = new TemelDers("Programlamaya Giris", "101", "Güz", false, akademisyen2, 3);
        UygulamaliDers lab1 = new UygulamaliDers("Biyoloji", "301", "Güz", false, akademisyen1, 3);

        bilgiPaketi.dersEkle(ders1);
        bilgiPaketi.dersEkle(lab1);

        ders1.derseYazilim(ogrenci2);
        lab1.derseYazilim(ogrenci1);
        
        ders1.listeyiYazdir();
        lab1.listeyiYazdir();

        bilgiPaketi.transkriptSorgula(ogrenci1);
        bilgiPaketi.transkriptSorgula(ogrenci2);
        
    }
}