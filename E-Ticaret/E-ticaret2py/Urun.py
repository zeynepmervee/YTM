class Urun:

    def __init__(self, isim, fiyat):
       self.isim=isim
       self.fiyat=fiyat
       self.id=None

    def get_fiyat(self):
        return self.fiyat