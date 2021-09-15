package SeperationOfConcerns;

public class AddressbookPresentation extends Presentation{

    public AddressbookPresentation(BusinessLogic businessLogic) {

        super(businessLogic); // 상속해온 상위 객체의 constructor 생성
    }

    @Override
    public void doPresentation(String arg){
        super.doPresentation(arg);
        System.out.println("*****결과는"+this.businessLogic.doBusinessLogic(arg)+"입니다.****");
    }
}
