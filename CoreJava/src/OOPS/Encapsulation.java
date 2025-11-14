package OOPS;

public class Encapsulation {

    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}

class mains extends Encapsulation{
    public static void main(String[] args) {
        Encapsulation op= new Encapsulation();
        op.setNum1(100);
        op.setNum2(2000);

        System.out.println(op.getNum1());
        System.out.println(op.getNum2());
    }
}
