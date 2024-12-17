public class Main{
    public static void main(String args){
        Kitap kitap = new Kitap(new Beyaz(),new A4());
        Dergi dergi= new Dergi(new Kirmizi(), new A5());

        System.out.println(kitap.renk.toString());
        System.out.println(dergi.renk.toString());

}
}

