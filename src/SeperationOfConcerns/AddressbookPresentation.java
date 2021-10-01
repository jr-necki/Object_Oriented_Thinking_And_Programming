package SeperationOfConcerns;

public class AddressbookPresentation extends Presentation{

    @Override
    public void doPresentation(String arg){
        super.doPresentation(arg);
        System.out.println("*****결과는"+this.businessLogic.doBusinessLogic(arg)+"입니다.****");
    }
}
