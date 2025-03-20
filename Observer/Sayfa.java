public class Sayfa extends ATakipEdilen {
    public Sayfa(String isim){
        super(isim);
    }

    @Override
    public void paylas(Post post){
        System.out.println(getIsim()+ "sayfa");
        tumunuBilgilendir(post);
    }
}
