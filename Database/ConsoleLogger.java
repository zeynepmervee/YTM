public class ConsoleLogger implements ILogger {
    public void write (String message){
        System.out.println(message);
    }
}
