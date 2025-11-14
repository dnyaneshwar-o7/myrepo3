package com.Hql;

import com.example.Student;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HqlExample {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Session s = factory.openSession();
        String query="from Student";

        Query q = s.createQuery(query);

        List<Student> list=q.getResultList();

        for (Student student:list)
        {
            System.out.println(student.getSname()+ " :" +student.getCity());
        }


        s.close();
        factory.close();
    }
}
