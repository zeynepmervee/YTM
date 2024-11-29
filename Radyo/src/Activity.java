
import java.util.ArrayList;
import java.util.List;

public class Activity {
    public void onCreate();
}
class MainActivity implements Activity {
    public void onCreate(){
        MediaPlayer mediaPlayer=new MediaPlayer();
        mediaPlayer.oynat();
        System.out.println("MainActivity arayüzü");
    }
    
}
class ListeActivity implements Activity {
    List<Kanal> kanalListesi;

    public void onCreate(){
        System.out.println("ListeActivity arayüzü");

        kanalListesi=new ArrayList<Kanal>();

        kanalListesi.add(new Kanal("Kanal1", "Link1"));
        kanalListesi.add(new Kanal("Kanal2", "Link2"));
        kanalListesi.add(new Kanal("Kanal3", "Link3"));
        kanalListesi.add(new Kanal("Kanal4", "Link4"));
        kanalListesi.add(new Kanal("Kanal5", "Link5"));

    }
    
}
public void onClick(int index){
    MainActivity mainActivity = new MainActivity();
    mainActivity.setKanal(kanalListesi.get(index));
    mainActivity.onCreate();
}


