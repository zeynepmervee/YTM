from abc import ABC, abstractmethod
from typing import List
from Urun import Urun

class Kullanici(ABC):
    def __init__(self):
        self.id=None
        self.isim=None
        self.mail=None
        self.urunler=[]

    def get_toplam_tutar(self, fiyat):
        raise NotImplementedError("alt siniflarda override edilemeli.")
    def get_isim(self):
        return self.isim    
    def get_urunler(self):
        return self.urunler
    def get_urun(self, index):
        return self.get_urunler()[index]
    def add_urun(self, urun):
        self.get_urunler().append(urun)