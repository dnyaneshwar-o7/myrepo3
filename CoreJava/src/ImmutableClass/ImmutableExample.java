package ImmutableClass;

final class Student{
    private final int id;
    private final String name;
    private final Address address;

    Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
class Address{
    private String city;
    private String state;
    private int code;

    public Address(String city, String state, int code) {
        this.city = city;
        this.state = state;
        this.code = code;
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
public class ImmutableExample {
    public static void main(String[] args) {
        Address address=new Address("pune","Maharashtra",1222);
        address.setCity("pune");
        address.setState("Maharashtra");
        address.setCode(5555);

        Student s1=new Student(1223,"ram",address);
        System.out.println(s1);
    }
}
