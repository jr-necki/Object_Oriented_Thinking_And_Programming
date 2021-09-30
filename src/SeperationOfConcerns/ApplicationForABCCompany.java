package SeperationOfConcerns;

public class ApplicationForABCCompany extends Application{
    @Override
    public Presentation createPresentation(){
        return  new Presentation(
                new AddressbookBusinessLogic(
                        new AddressbookMySQLDatabase()
                )
        );
    }
}