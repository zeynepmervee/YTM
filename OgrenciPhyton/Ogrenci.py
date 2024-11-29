class Ogrenci:
    def __init__(self, ad, soyad, bolum, fakulte, numara, giris_yili, sinif):
        self.ad = ad
        self.soyad = soyad
        self.bolum = bolum
        self.fakulte = fakulte
        self.numara = numara
        self.giris_yili = giris_yili
        self.sinif = sinif

    def get_ad(self):
        return self.ad

    def get_soyad(self):
        return self.soyad

    def get_bolum(self):
        return self.bolum

    def get_fakulte(self):
        return self.fakulte

    def get_numara(self):
        return self.numara

    def get_giris_yili(self):
        return self.giris_yili

    def get_sinif(self):
        return self.sinif

    def set_ad(self, ad):
        self.ad = ad

    def set_soyad(self, soyad):
        self.soyad = soyad

    def set_bolum(self, bolum):
        self.bolum = bolum

    def set_fakulte(self, fakulte):
        self.fakulte = fakulte

    def set_numara(self, numara):
        self.numara = numara

    def set_giris_yili(self, giris_yili):
        self.giris_yili = giris_yili

    def set_sinif(self, sinif):
        self.sinif = sinif
