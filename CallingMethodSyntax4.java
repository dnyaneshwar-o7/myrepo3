package JavaBasicProgramming;

public class CallingMethodSyntax4 {
    public static void main(String[] args) {
        CallingMethodSyntax4 ooo = new CallingMethodSyntax4();
        int res = ooo.addition(10,20, 30);
        System.out.println("Result of addition is "+res); //60

        long l = ooo.multiply(10, 20);
        System.out.println("Multiplication of 2 numbers is "+l); //200
    }

    int addition(int a, int b, int c){
        return a + b + c;
    }

    long multiply(int a, int b){
        return a * b;
    }
}
