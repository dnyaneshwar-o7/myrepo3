package org.example;

public class Emp {


    private String EmpName;
   private String city;
   private String state;

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Emp(String empName, String city, String state) {
        EmpName = empName;
        this.city = city;
        this.state = state;
    }

    public Emp() {
        super();
    }
}
