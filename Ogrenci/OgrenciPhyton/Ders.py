from abc import ABC, abstractmethod

class Ders(ABC):
    def __init__(self, ders_adi, ders_kodu, donem, secmeli, ders_sorumlusu, kredi):
        self.ders_adi = ders_adi
        self.ders_kodu = ders_kodu
        self.donem = donem
        self.secmeli = secmeli
        self.ders_sorumlusu = ders_sorumlusu
        self.kredi = kredi
        self.ogrenci_listesi = []

    @abstractmethod
    def not_hesapla(self, *notlar):
        pass

    def derse_yazilim(self, ogrenci):
        self.ogrenci_listesi.append(ogrenci)

    def ogrenci_kayitli_mi(self, numara):
        for ogrenci in self.ogrenci_listesi:
            if ogrenci.get_numara() == numara:
                return True
        return False

    def listeyi_yazdir(self):
        print(f"{self.ders_adi} Öğrenci Listesi:")
        for ogrenci in self.ogrenci_listesi:
            print(f"{ogrenci.get_ad()} {ogrenci.get_soyad()}")

    def __str__(self):
        return f"Ders: {self.ders_adi}, Kod: {self.ders_kodu}, Dönem: {self.donem}, Seçmeli: {'Evet' if self.secmeli else 'Hayır'}, Kredi: {self.kredi}"

    def harf_notu(self, ortalama):
        if ortalama >= 90:
            return "AA"
        elif ortalama >= 80:
            return "BA"
        elif ortalama >= 70:
            return "BB"
        elif ortalama >= 60:
            return "CB"
        elif ortalama >= 50:
            return "CC"
        elif ortalama >= 40:
            return "DC"
        elif ortalama >= 30:
            return "DD"
        else:
            return "FF"
