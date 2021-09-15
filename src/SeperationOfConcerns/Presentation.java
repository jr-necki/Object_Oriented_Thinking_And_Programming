package SeperationOfConcerns;

public class Presentation {
    BusinessLogic businessLogic;
    public Presentation(BusinessLogic businessLogic) {
        assert(businessLogic!=null); // 강력하게 체크
        this.businessLogic = businessLogic;
    }


    public void doPresentation(String arg) {
        System.out.println("결과는"+businessLogic.doBusinessLogic(arg)+"입니다.");
    }
}
