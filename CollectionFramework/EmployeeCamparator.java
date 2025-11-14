package CollectionFramework;

import java.util.Comparator;

public class EmployeeCamparator {


    private String fName;
    private String lName;
    private int age;
    private int salary;

    public EmployeeCamparator(){
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.salary = salary;

    }

    public String getFName() {
        return fName;
    }
    public void setFName(String FName) {
        this.fName = FName;
    }

    public String getLName(){
        return lName;
    }

    public void SetName(String LName){
        this.lName=lName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(int Salary){
        this.salary=Salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class fnamecomparator implements Comparator<EmployeeCamparator> {
    @Override
    public int compare(EmployeeCamparator o1, EmployeeCamparator o2) {
        return 0;
    }
}

//
//public class Sorting{
//    public static void main(String[] args) {
//
//    }
//}