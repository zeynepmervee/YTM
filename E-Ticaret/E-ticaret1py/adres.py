class Adres:
    def __init__(self):
        self.__ulke = None
        self.__il = None
        self.__ilce = None
        self.__postKodu = None

    @property
    def ulke(self):
        return self.__ulke

    @ulke.setter
    def ulke(self, ulke):
        self.__ulke = ulke

    @property
    def il(self):
        return self.__il

    @il.setter
    def il(self, il):
        self.__il = il

    @property
    def ilce(self):
        return self.__ilce

    @ilce.setter
    def ilce(self, ilce):
        self.__ilce = ilce

    @property
    def postKodu(self):
        return self.__postKodu

    @postKodu.setter
    def postKodu(self, postKodu):
        self.__postKodu = postKodu

    def __str__(self):
        return f"{self.ulke} {self.il} {self.ilce} {self.postKodu}"
