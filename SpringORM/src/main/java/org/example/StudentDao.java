package org.example;

import jakarta.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

public class StudentDao {

    private HibernateTemplate hibernateTemplate;

    public Integer insert(Student student){
        Integer i = (Integer) this.hibernateTemplate.save(student);
        return i;
    }

    public Student getStudent(int studentId){
        Student student =this.hibernateTemplate.get(Student.class,studentId);
        return student;

    }
    public List<Student> getAllStudents(){
        List<Student> students =this.hibernateTemplate.loadAll(Student.class);
        return students;

    }

    @Transactional
    public void deleteStudent(int studentId){
        Student student =this.hibernateTemplate.get(Student.class,studentId);
        this.hibernateTemplate.delete(student);
    }

    @Transactional
    public void updateStudent(Student student){
        this.hibernateTemplate.update(student);
    }
    public HibernateTemplate getHibernateTemplate(){
        return hibernateTemplate;
    }


}








