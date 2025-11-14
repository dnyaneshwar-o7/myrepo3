package ExceptionHandling;

public class compileTimeA {
    public static void main(String[] args) {
        Object obj= new String("Hello World");
        Integer num= (Integer) obj;

//        reason= Trying to cast an object of one type to another incompatible type
    }
}
