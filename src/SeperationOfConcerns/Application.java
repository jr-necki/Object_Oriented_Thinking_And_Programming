package SeperationOfConcerns;

public class Application {
    public static void main(String[] args) {
        Presentation presentation = new AddressbookPresentation(
                new AddressbookBusinessLogic(
                        new AdressbookDatabase()
                )
        );
        String arg = "산본";
        presentation.doPresentation(arg.length() > 0 ? arg: null);
    }
}
