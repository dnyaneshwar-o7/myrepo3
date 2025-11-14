package ObjectClassMethod;

public class Student {

    int id=20;
    String name="Ram";


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}

class main extends Student{
    public static void main(String[] args) {
        Student op= new Student();
        System.out.println(op.id);
        System.out.println(op.name);
    }
}
