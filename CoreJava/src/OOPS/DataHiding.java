package OOPS;

public class DataHiding {

    private double num;
    private String name;

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class main{
    public static void main(String[] args) {
        DataHiding op=new DataHiding();
        op.setName("Ram");
        op.setNum(656454);

        System.out.println(op.getName());
        System.out.println(op.getNum());

    }
}