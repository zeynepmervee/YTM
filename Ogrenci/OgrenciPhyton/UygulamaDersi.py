from Ders import Ders


class UygulamaDersi(Ders):
    def __init__(self, ders_adi, ders_kodu, donem, secmeli, ders_sorumlusu, kredi):
        super().__init__(ders_adi, ders_kodu, donem, secmeli, ders_sorumlusu, kredi)

    def not_hesapla(self, *notlar):
        if len(notlar) != 2:
            raise ValueError("Uygulamalı dersler için 2 not girilmelidir (vize, final).")
        ortalama = (notlar[0] * 0.4) + (notlar[1] * 0.6)
        return self.harf_notu(ortalama)
