package ExceptionHandling;

public class MultipleCatchblock {
    public static void main(String[] args) {
        try {

            int arr[] = new int[6];

            arr[3] = 20 / 0;

            System.out.println("this is Try block");
        }
        catch (ArithmeticException e){
            System.out.println("A number cannot be divide by zero");
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Accessing the array outside the specified limit");
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("it is outside the try catch block");
    }
}
