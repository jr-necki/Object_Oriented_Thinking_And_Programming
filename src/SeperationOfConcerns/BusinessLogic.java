package SeperationOfConcerns;

public class BusinessLogic {
    Database database;

    public void setDatabase(Database database) {
        this.database = database;
    }

    public Database getDatabase() {
        if(database == null) throw new RuntimeException("DATABASE MUST BE NOT NULL!");
        return database;
    }

    public BusinessLogic() {

    }

    public String doBusinessLogic(String arg) {

        try{
            this.database.load();
            this.database.save(arg);
            return "ok";
        }catch (Exception e){
            return "failed";
        }

    }
}
