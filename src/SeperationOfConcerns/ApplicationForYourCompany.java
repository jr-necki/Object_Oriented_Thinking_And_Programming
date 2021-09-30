package SeperationOfConcerns;

public class ApplicationForYourCompany extends Application{
    @Override
    public Presentation createPresentation(){
        return  new Presentation(
                new AddressbookBusinessLogic(
                        new AddressbookOracleDatabase()
                )
        );
    }
}