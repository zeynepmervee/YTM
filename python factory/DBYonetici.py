from abc import ABC,abstractmethod

#Abstarct factory sınıfı
class DBYonetici(ABC):
    @abstractmethod
    def get_database(self):
        pass
 