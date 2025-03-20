from Urun import Urun
from Kullanici import Kullanici

class Siparis:
    @staticmethod
    def odeme_yap( kullanici):
        toplam_tutar=0
        for urun in kullanici.get_urunler():
            toplam_tutar += urun.get_fiyat()
        toplam_tutar = kullanici.get_toplam_tutar(toplam_tutar)
        print(f"{kullanici.__class__.__name__} Toplam Tutar = {toplam_tutar}")
     #print(f"{kullanici.__class__.__name__} Toplam Tutar = {toplam_tutar}")
