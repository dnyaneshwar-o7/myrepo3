package StandaloneCollection;

import java.util.List;

public class Person {

    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Person(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Person{" +
                "list=" + list +
                '}';
    }
}
