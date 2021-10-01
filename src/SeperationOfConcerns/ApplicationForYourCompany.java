package SeperationOfConcerns;

public class ApplicationForYourCompany extends Application{
    @Override
    public Presentation createPresentation(){
        return  new WindowPresentaion();
    }

    @Override
    public Database createDatabase() {
        return new AddressbookOracleDatabase();
    }

    @Override
    public BusinessLogic createBusinessLogic() {
        return new AddressbookBusinessLogic();
    }
}