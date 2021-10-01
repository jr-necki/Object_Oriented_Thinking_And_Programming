package SeperationOfConcerns;

public class Presentation {
    BusinessLogic businessLogic;

    public BusinessLogic getBusinessLogic(){
        return businessLogic;
    }

    public void setBusinessLogic (BusinessLogic businessLogic){
        this.businessLogic = businessLogic;
    }
    public void doPresentation(String arg) {

        System.out.println("결과는"+businessLogic.doBusinessLogic(arg)+"입니다.");
    }



}
