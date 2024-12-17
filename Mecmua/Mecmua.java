abstract class Mecmua {
    Renk renk; Boyut boyut;
    public Mecmua(){}
    public Mecmua(Renk renk,Boyut boyut){
        setRenk(renk);
        setBoyut(boyut);

    }
    public void setRenk(Renk renk){
        this.renk=renk;
    }
    public void setBoyut(Boyut boyut){
        this.boyut=boyut;
    }
}

class Kitap extends Mecmua{
    public Kitap(){
        super(renk,boyut);
    }
}
class Dergi extends Mecmua{
    public Dergi(){
        super(renk,boyut);
    }
}

interface Renk {}
class Beyaz implements Renk{}
class Kirmizi implements Renk{}

interface Boyut{}
class A4 implements Boyut{}
class A5 implements Boyut{}
