package SeperationOfConcerns;

public abstract class Application {
    public static void main(String[] args) throws Exception {
        String path = "SeperationOfConcerns.";
        String path2 = "AddressbookFor";
        String args0 = "YourCompany";
        Application application = (Application)Class.forName(path2+args0).newInstance();
        Presentation presentation = application.createPresentation();
       
        presentation.doPresentation("test");
    }

    abstract public Presentation createPresentation();
}
