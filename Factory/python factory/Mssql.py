from IDatabase import IDatabase

class Mssql(IDatabase):
    def veri_ekle(self):
        print("Mssql'de veri ekleme gerceklestirildi.")
    def veri_cek(self):
        print("Mssql'de veri cekme gerceklestirildi.") 