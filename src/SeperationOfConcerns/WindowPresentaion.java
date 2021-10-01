package SeperationOfConcerns;

public class WindowPresentaion extends Presentation{
    @Override
    public void doPresentation(String arg) {
        System.out.println("--------윈도우 모드--------");
        super.doPresentation(arg);
    }
}
