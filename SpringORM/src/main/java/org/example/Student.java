package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_table")
public class Student {
    @Column(name = "Student_Id")
    private int student_id;

    @Column(name = "Student_Name")
    private String student_name;

    @Column(name = "Student_City")
    private String student_city;

    public Student(int student_id, String student_name, String student_city) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_city = student_city;
    }

    public Student() {
        super();
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_city() {
        return student_city;
    }

    public void setStudent_city(String student_city) {
        this.student_city = student_city;
    }
}
