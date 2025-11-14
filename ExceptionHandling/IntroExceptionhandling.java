package ExceptionHandling;

public class IntroExceptionhandling {

    int divide(int a, int b) {
        int c = a / b;
        return c;
    }

    public static void main(String[] args) {
        IntroExceptionhandling obj=new IntroExceptionhandling();
        System.out.println(obj.divide(100,10));
        IntroExceptionhandling obj1=new IntroExceptionhandling();
        System.out.println(obj1.divide(100,10));
    }


}
