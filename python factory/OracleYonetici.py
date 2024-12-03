from DBYonetici import DBYonetici
from Oracle import Oracle

#Oracle factory sınıfı
class OracleYonetici(DBYonetici):
    def get_database(self):
        return Oracle()