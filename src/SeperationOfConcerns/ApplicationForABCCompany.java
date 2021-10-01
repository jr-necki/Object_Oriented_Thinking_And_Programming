package SeperationOfConcerns;

public class ApplicationForABCCompany extends Application{
    @Override
    public Presentation createPresentation(){
        return new Presentation();
    }

    @Override
    public Database createDatabase() {
        return new AddressbookMySQLDatabase();
    }

    @Override
    public BusinessLogic createBusinessLogic() {
        return new AddressbookBusinessLogic();
    }
}