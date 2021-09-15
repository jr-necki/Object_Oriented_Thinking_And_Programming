package SeperationOfConcerns;

public class BusinessLogic {
    Database database;

    public BusinessLogic(Database database) {
        this.database = database;
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
