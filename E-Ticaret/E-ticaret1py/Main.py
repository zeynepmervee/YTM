from adres import Adres
from Kullanici import Kullanici

class Main:
    @staticmethod
    def main():
        kullanici = Kullanici()
        kullanici.isim = "Sefa Aras"
        kullanici.mail = "sefaaras@ktu.edu.tr"
        
        adres = Adres()
        adres.ulke = "Turkiye"
        adres.il = "Trabzon"
        adres.ilce = "Of"
        
        kullanici.adresGuncelle(adres)
        print(kullanici.__str__())
        
        adres.postKodu = 61000
        kullanici.adresGuncelle(adres)
        print(kullanici.__str__())

# Ana programı çalıştırmak için
if __name__ == "__main__":
    Main.main()
