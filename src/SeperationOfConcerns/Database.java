package SeperationOfConcerns;

public class Database {

    public  void save(String hi){
        if(hi == null){
            throw new RuntimeException("저장값은 null이면 안됩니다.");
        }
    }
    public  void load(){

    }
}
