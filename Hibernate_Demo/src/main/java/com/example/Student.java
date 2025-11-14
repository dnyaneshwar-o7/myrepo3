package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.mapping.Collection;

import java.util.Comparator;

@Entity
public class Student {
    @Id
    private int id;
    private String sname;
    private String city;

    public Student(int id, String sname, String city) {
        this.id = id;
        this.sname = sname;
        this.city = city;
    }

    public Student() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

}
