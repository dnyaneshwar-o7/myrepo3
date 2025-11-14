package Collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp1 {

    private String empName;
    private List<String> phone_no;
    private Set<String>  addresses;
    private Map<String, String>  courses;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public List<String> getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(List<String> phone_no) {
        this.phone_no = phone_no;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Emp1(String empName, List<String> phone_no, Set<String> addresses, Map<String, String> courses) {
        this.empName = empName;
        this.phone_no = phone_no;
        this.addresses = addresses;
        this.courses = courses;
    }

    public Emp1() {
        super();
    }
}
