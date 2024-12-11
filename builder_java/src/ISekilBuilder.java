public interface ISekilBuilder {
    void baslangicBelirle(String baslangicKonumu);
    void kenariCiz(int kenarSayisi, int kenarUzunlugu, int kenarKalinligi);
    void kenariBoya(String kenarRengi);
    void iciniBoya(String icRengi);
    Sekil getResult();
}