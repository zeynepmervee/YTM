public class ConcreteSekilBuilder implements ISekilBuilder {
    private Sekil sekil;

    public ConcreteSekilBuilder() {
        this.sekil = new Sekil();
    }

    @Override
    public void baslangicBelirle(String baslangicKonumu) {
        sekil.baslangicKonumu = baslangicKonumu + " baslangic konumu secildi";
    }

    @Override
    public void kenariCiz(int kenarSayisi, int kenarUzunlugu, int kenarKalinligi) {
        sekil.kenar = kenarSayisi + " kenarli, her kenari " + kenarUzunlugu + " cm ve kalinligi " + kenarKalinligi + " olan sekil cizildi";
    }

    @Override
    public void kenariBoya(String kenarRengi) {
        sekil.kenarRengi = "Sekil kenarlari " + kenarRengi + " ile boyandi";
    }

    @Override
    public void iciniBoya(String icRengi) {
        sekil.icRengi = "Seklin ici " + icRengi + " ile boyandi";
    }

    @Override
    public Sekil getResult() {
        return this.sekil;
    }
}