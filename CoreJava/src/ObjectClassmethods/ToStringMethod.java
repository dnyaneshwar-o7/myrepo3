package ObjectClassmethods;

public class ToStringMethod {
    //Student destils

    private int rollnumber;
    private String name;
    private double marks;

    public ToStringMethod(int rollnumber, String name, double marks) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "ToStringMethod{" +
                "rollnumber=" + rollnumber +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
class main{
    public static void main(String[] args) {
        ToStringMethod s1 =new ToStringMethod(101,"Ram",90);
        ToStringMethod s2=new ToStringMethod(102,"shyam",95);
        ToStringMethod s3=new ToStringMethod(103,"bigbull",97);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
