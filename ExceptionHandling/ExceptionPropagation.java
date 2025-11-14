package ExceptionHandling;

public class ExceptionPropagation {
    public static void main(String[] args) throws ArithmeticException{
        ExceptionPropagation obj= new ExceptionPropagation();
        obj.m1();
    }

    void m1() throws ArithmeticException{

      m2();
    }

    void m2() throws ArithmeticException{

        m3();
    }

    void m3() throws ArithmeticException{

        m4();
        
    }

    void m4() throws ArithmeticException{
        try {
            int a = 100 / 0;
//            System.out.println(a);

        }catch (ArithmeticException e) {
            System.out.println("Exception handle here");
        }
    }
}
