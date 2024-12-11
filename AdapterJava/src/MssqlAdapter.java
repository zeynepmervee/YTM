public class MssqlAdapter implements DB {
    Mssql mssql;

    public MssqlAdapter(){
        mssql = new Mssql();
    }

    @Override
    public User selectUserById(int Id){
        return mssql.userById(Id);
    }
    @Override
    public void insertUser(User user){
        mssql.user(user);
    }
}
