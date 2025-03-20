from Kullanici import Kullanici

class PremiumKullanici(Kullanici):
    def get_toplam_tutar(self, fiyat):
        return fiyat * 0.9