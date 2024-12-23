class BilgiPaketi:
    def __init__(self):
        self.tum_dersler = []

    def ders_ekle(self, ders):
        self.tum_dersler.append(ders)

    def transkript_sorgula(self, ogrenci):
        for ders in self.tum_dersler:
            if ders.ogrenci_kayitli_mi(ogrenci.get_numara()):
                print(f"{ogrenci.get_ad()} {ogrenci.get_soyad()} adlı öğrencinin transkripti:")
                print(f"{ders.ders_adi} dersi:")
                print(f"Dersin kredisi: {ders.kredi}")
                print(f"Harf notu: {ders.harf_notu(0)}")