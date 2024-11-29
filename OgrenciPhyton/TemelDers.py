from Ders import Ders



class TemelDers(Ders):
    def __init__(self, ders_adi, ders_kodu, donem, secmeli, ders_sorumlusu, kredi):
        super().__init__(ders_adi, ders_kodu, donem, secmeli, ders_sorumlusu, kredi)

    def not_hesapla(self, *notlar):
        if len(notlar) != 3:
            raise ValueError("Temel dersler için 3 not girilmelidir (Vize, Final, Proje).")
        ortalama = (notlar[0] * 0.3) + (notlar[1] * 0.5) + (notlar[2] * 0.2)
        return self.harf_notu(ortalama)
