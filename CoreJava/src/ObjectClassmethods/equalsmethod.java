package ObjectClassmethods;

public class equalsmethod {

    String name;
    int rollno;

    public equalsmethod(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public static void main(String[] args) {
        equalsmethod s1=new equalsmethod("Ram",101);
        equalsmethod s2=new equalsmethod("shyam", 102);
        equalsmethod s3=new equalsmethod("Ram",101);

        String s4="ravi";
        String s5="ravi";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1==s3);
        System.out.println(s4==s5);
    }
}
