from MysqlYonetici import MysqlYonetici
from MssqlYonetici import MssqlYonetici
from OracleYonetici import OracleYonetici

if __name__ == "__main__":
    mySqlYonetici = MysqlYonetici()  
    mySql = mySqlYonetici.get_database()  
    
    mySql.veri_cek()  
    mySql.veri_ekle()

    msSqlYonetici = MssqlYonetici()
    msSql = msSqlYonetici.get_database()

    msSql.veri_cek()
    msSql.veri_ekle()

    oracleYonetici = OracleYonetici()
    oracle = oracleYonetici.get_database()

    oracle.veri_cek()
    oracle.veri_ekle()