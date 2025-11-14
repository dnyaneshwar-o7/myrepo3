package ConstructorInjection;

import java.util.List;

public class Person {

    private String pname;
    private int pid;
    private Certi certi;
    private List<String> list;

    public Person(String pname, int pid, Certi certi, List<String> list) {
        this.pname = pname;
        this.pid = pid;
        this.certi = certi;
        this.list = list;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pname='" + pname + '\'' +
                ", pid=" + pid +
                ", certi=" + certi +
                ", list=" + list +
                '}';
    }
}
