from abc import ABC,abstractmethod
class IDatabase(ABC):
    @abstractmethod
    def veri_cek(self):
        pass
    def veri_ekle(self):
        pass