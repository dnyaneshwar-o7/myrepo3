package ExceptionHandling;

public class RunTimeErrorA {
    public static void main(String[] args) {
        int a= 10;
        int b=0;
        System.out.println(a/b); //ArithmeticException
        //Reason= division by zero
    }
}
