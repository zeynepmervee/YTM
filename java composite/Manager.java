// Leaf
public class Manager implements Employee {
    private int id;
    private String name;

    public Manager(int id, String name){
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
        System.out.println("Manager's name: " + this.name + " | id: " + this.id);
    }
    
}
