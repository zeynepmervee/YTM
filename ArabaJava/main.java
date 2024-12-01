public class main{
    public static void main(String[] args){
        ferrari ferrari = new ferrari(0, 0);
        System.out.println("FERRARI:");
        ferrari.power();
        System.out.println("aracin baslangic hizi: " + ferrari.getVelocity());
        ferrari.run();
        System.out.println("aracin calistiktan sonraki hizi: " + ferrari.getVelocity());
        ferrari.boost();
        ferrari.run();
        System.out.println("aracin boostlandiktan sonraki hizi: " + ferrari.getVelocity());
        ferrari.open();
        ferrari.run();
        System.out.println("aracin klima acildiktan sonraki hizi: " + ferrari.getVelocity());


        mercedes mercedes = new mercedes(0, 0);
        System.out.println("MERCEDES:");
        mercedes.power();
        System.out.println("aracin baslangic hizi: " + mercedes.getVelocity());
        mercedes.run();
        System.out.println("aracin calistiktan sonraki hizi: " + mercedes.getVelocity());
        mercedes.boost();
        mercedes.run();
        System.out.println("aracin boostlandiktan sonraki hizi: " + mercedes.getVelocity());

        tofas tofas = new tofas(0, 0);
        System.out.println("TOFAS:");
        tofas.power();
        System.out.println("aracin baslangic hizi: " + tofas.getVelocity());
        tofas.run();
        System.out.println("aracin calistiktan sonraki hizi: " + tofas.getVelocity());
        tofas.open();
        tofas.run();
        System.out.println("aracin klima acildiktan sonraki hizi: " + tofas.getVelocity());

    }
}    
