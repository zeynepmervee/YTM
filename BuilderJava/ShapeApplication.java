public class ShapeApplication {
    public ShapeApplication() {
    }
 
    public static void main(String[] var0) {
       ConcreteShapeBuilder var1 = new ConcreteShapeBuilder();
       Director var2 = new Director(var1);
       Shape var3 = var2.constructShape();
       System.out.println(var3);
    }
 }
