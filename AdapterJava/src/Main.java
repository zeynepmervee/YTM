public class Main {

    public static void main(String args[]){
        
        MssqlAdapter adapter = new MssqlAdapter();
        Service service = new Service(adapter);

        service.addUser(new User("Kullanici1")); //id=0
        service.addUser(new User("Kullanici2")); //id=1
        service.addUser(new User("Kullanici3")); //id=2

        User user = service.getUser(1);
        System.out.println(user.getName());
    }
    

}
