public class main {
    public static void main(String[] args) throws Exception {
        DbLogger dbLogger = new DbLogger();
        ConsoleLogger consoleLogger = new ConsoleLogger();

        dbLogger.write("log 1");

        dbLogger.openConnection();
        dbLogger.write("log 2");
        consoleLogger.write("log 3");
        dbLogger.write("log 4");
        dbLogger.closeConnection();

        dbLogger.write("log 5");

        for(String message: dbLogger.database.getList()){
            System.out.println(message);
        }
    }
}
