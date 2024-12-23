from DBYonetici import DBYonetici
from Mssql import Mssql

#Mssql factory sınıfı
class MssqlYonetici(DBYonetici):
    def get_database(self):
        return Mssql()