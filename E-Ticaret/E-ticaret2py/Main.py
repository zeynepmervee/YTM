from Urun import Urun
from StandartKullanici import StandartKullanici
from PremiumKullanici import PremiumKullanici
from Siparis import Siparis

class Main:
    @staticmethod
    def main():
        ali = StandartKullanici()
        veli = PremiumKullanici()
        telefon = Urun("telefon", 3000)
        bilgisayar = Urun("bilgisayar", 5000)

        ali.add_urun(telefon)
        ali.add_urun(bilgisayar)
        veli.add_urun(telefon)
        veli.add_urun(bilgisayar)

        Siparis.odeme_yap(ali)
        Siparis.odeme_yap(veli)

if __name__ == "__main__":
    Main.main()

