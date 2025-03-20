class Kullanici:
    def __init__(self):
        self.__isim = None
        self.__mail = None
        self.__adres = None

    @property
    def isim(self):
        return self.__isim

    @isim.setter
    def isim(self, isim):
        self.__isim = isim

    @property
    def mail(self):
        return self.__mail

    @mail.setter
    def mail(self, mail):
        self.__mail = mail

    def adresGuncelle(self, adres):
        self.__adres = adres

    def getAdres(self):
        return self.__adres.__str__() if self.__adres else None

    def __str__(self):
        return f"{self.isim} {self.mail} {self.getAdres()}"

    def girisYap(self, mail, sifre):
        print("Giriş yapıldı.")
