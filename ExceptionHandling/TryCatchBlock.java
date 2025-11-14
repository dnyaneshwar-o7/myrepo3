package ExceptionHandling;

public class TryCatchBlock {
    public static void main(String[] args) {
//        int x = 10/0;
//        System.out.println("this is the trycatch block");

        try {
            int y = 10/0;
        }catch (ArithmeticException e){
            System.out.println("Heelo World");
        }
        finally {
            System.out.println("finally block");
        }
    }
}
