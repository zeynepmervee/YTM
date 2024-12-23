from IDatabase import IDatabase

class Mysql(IDatabase):
    def veri_ekle(self):
        print("Mysql'de veri ekleme gerceklestirildi.")
    def veri_cek(self):
        print("Mysql'de veri cekme gerceklestirildi.") 