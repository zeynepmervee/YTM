public class DbLogger implements ILogger, IConnection  {
    Database database;

    public DbLogger(){
        database=new Database();
    }

    public void write(String message){
        database.addLog(message);
    }
    public void openConnection(){
        database.openDatabase();
    }

    public void closeConnection(){
        database.closeDatabase();
    }
}
