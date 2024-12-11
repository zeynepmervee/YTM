public class Service {
    DB db;
    
    public Service(DB db){
        setDb(db);
    }

    public User getUser(int id){
        return db.selectUserById(id);
    }

    public void addUser(User user){
        db.insertUser(user);
    }

    public DB getDb(){
        return db;
    }
    public void setDb(DB db){
        this.db=db;
    }
}
