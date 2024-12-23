from Akademisyen import Akademisyen
from BilgiPaketi import BilgiPaketi
from Ogrenci import Ogrenci
from UygulamaDersi import UygulamaDersi
from TemelDers import TemelDers


def main():
    ogrenci_zeynep = Ogrenci("Zeynep Merve", "Koyuncu", "yazilim", "of", 427647, 2022, 3)
    print(f"Ogrencinin adi: {ogrenci_zeynep.get_ad()}")
    print(f"Ogrencinin soyadi: {ogrenci_zeynep.get_soyad()}")
    print(f"Ogrencinin numarasi: {ogrenci_zeynep.get_numara()}")

    ogrenci1 = Ogrenci("Emre", "Celik", "yazilim", "of teknoloji", 1756001, 2022, 1)
    ogrenci2 = Ogrenci("Sevval", "Acar", "yazilim", "of teknoloji", 5117002, 2022, 1)
    ogrenci3 = Ogrenci("Mustafa", "Demir", "yazilim", "of teknoloji", 2981203, 2022, 1)

    akademisyen1 = Akademisyen("Salih", "Yilmaz")
    akademisyen2 = Akademisyen("Eda", "Kurt")

    bilgi_paketi = BilgiPaketi()

    ders1 = TemelDers("Fizik", "101", "Guz", False, akademisyen1, 2)
    lab1 = UygulamaDersi("YTM", "301", "Guz", False, akademisyen2, 3)

    bilgi_paketi.ders_ekle(ders1)
    bilgi_paketi.ders_ekle(lab1)

    ders1.derse_yazilim(ogrenci1)
    ders1.derse_yazilim(ogrenci2)
    ders1.derse_yazilim(ogrenci3)
    lab1.derse_yazilim(ogrenci1)
    lab1.derse_yazilim(ogrenci3)

    ders1.listeyi_yazdir()
    lab1.listeyi_yazdir()

    bilgi_paketi.transkript_sorgula(ogrenci1)
    bilgi_paketi.transkript_sorgula(ogrenci2)


if __name__ == "__main__":
    main()
