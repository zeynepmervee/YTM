public class App {
    public static void main(String[] args) throws Exception {
        ISekilBuilder builder = new ConcreteSekilBuilder();
        Director director = new Director(builder);

        Sekil sekil = director.sekilOlustur();

        System.out.println(sekil);    }
}
