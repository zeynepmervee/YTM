from DBYonetici import DBYonetici
from Mysql import Mysql

#Mysql factory sınıfı
class MysqlYonetici(DBYonetici):
    def get_database(self):
        return Mysql()