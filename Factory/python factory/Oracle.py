from IDatabase import IDatabase

class Oracle(IDatabase):
    def veri_ekle(self):
        print("Oracle'da veri ekleme gerceklestirildi.")
    def veri_cek(self):
        print("Oracle'da veri cekme gerceklestirildi.") 