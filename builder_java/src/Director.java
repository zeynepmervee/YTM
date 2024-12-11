public class Director {
    private ISekilBuilder builder;

    public Director(ISekilBuilder builder) {
        this.builder = builder;
    }

    public Sekil sekilOlustur() {
        builder.baslangicBelirle("x=4, y=2");
        builder.kenariCiz(4, 4, 1);
        builder.kenariBoya("mavi");
        builder.iciniBoya("kirmizi");
        return builder.getResult();
    }
}