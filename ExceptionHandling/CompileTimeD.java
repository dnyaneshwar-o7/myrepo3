package ExceptionHandling;

public class CompileTimeD {
    public static void main(String[] args) {
//        sum(2);    //Wrong Number of Arguments in Method Call

        //Reason = he add method is expecting two arguments, but only one is passed
    }
    public void sum(int a, int b){
        System.out.println(a+b);
    }
}
