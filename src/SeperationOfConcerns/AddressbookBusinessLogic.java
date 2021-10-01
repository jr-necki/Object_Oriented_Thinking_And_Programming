package SeperationOfConcerns;

public class AddressbookBusinessLogic extends BusinessLogic{
    public AddressbookBusinessLogic() {

    }

    @Override
    public String doBusinessLogic(String arg){
        String value = "(주소)"+arg;
        this.database.save(value);
        this.database.load();

        return value;
    }
}
