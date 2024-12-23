import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<String> list;
    private boolean check = false;

    public Database(){
        list = new ArrayList<>();
    }

    public List<String> getList(){return this.list;}

    public void addLog(String log){
        if(check)
            list.add(log);
    }

    public void openDatabase(){
        System.out.println("veritabani baglantisi acik");
        check = true;
    }

    public void closeDatabase(){
        System.out.println("veritabani baglantisi kapali");
        check = false;
    }
}
