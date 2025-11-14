package BasicPrograms;


//Types of variables
//1. Local variable in java
//
//A Local variable in the method
//A local variable in a static block
//A local variable in instance block
//A local variable in Constructor
//
//2. Global variable in java
//
//Instance variables
//Static/class variables


public class VariblesIInJava {

  static {                                 //  A local variable in a static block
        String name="JavaGaol";
        System.out.println(name);
    }
    public static void main(String[] args) {
      Student S1= new Student();
         new VariblesIInJava();
    }
    VariblesIInJava(){                                    // A local variable in Constructor
      int a=2;
        System.out.println(a);
    }
}

class Student {
    int b=5;//Instance variables
    static int c=10;
    {                                                   //A local variable in instance block
        String StudentName="Ram";
        StudentName = StudentName + "Sita";
        System.out.println(StudentName);
    }
    public void StudentNo() {
        int rollno=5;                                  //A Local variable in the method
        System.out.println(rollno);
    }
        }
