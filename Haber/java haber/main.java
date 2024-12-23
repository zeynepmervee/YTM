public class main{
    public static void main(String[] args){
        Kullanici kullanici = new Kullanici("ozge", "ozge@gmail.com", 111, 0000);
        Haber haber = new Haber();
        
        haber.bilgilendir(kullanici, "deneme mesaji");
    }
}