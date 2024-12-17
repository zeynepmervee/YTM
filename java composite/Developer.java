// Leaf
public class Developer implements Employee {
    private int id;
    private String name;

    public Developer(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("Developer's name: " + this.name + " | id: " + this.id);
    }
    
}
