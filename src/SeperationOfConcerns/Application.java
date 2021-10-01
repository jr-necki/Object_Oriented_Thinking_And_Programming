package SeperationOfConcerns;

import Car_sim.Car;

public abstract class Application {
    public static void main(String[] args) throws Exception {
        String path = "SeperationOfConcerns.";
        String path2 = "ApplicationFor";
        String company = "ABCCompany";
        Application application = (Application) Class.forName(path+path2+company).newInstance();
        Presentation presentation = application.createPresentation();
        BusinessLogic businessLogic = application.createBusinessLogic();
        Database database = application.createDatabase();

        presentation.setBusinessLogic(businessLogic);
        businessLogic.setDatabase(database);

        presentation.doPresentation("test");
    }

    abstract public Presentation createPresentation();
    abstract public Database createDatabase();
    abstract public BusinessLogic createBusinessLogic();
}
