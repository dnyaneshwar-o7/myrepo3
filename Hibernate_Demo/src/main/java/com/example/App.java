package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        System.out.println("project started");

        Student s1 =new Student();
        s1.setId(101);
        s1.setSname("Ram");
        s1.setCity("pune");

        Student s2=new Student();
        s2.setId(102);
        s2.setSname("Shyam");
        s2.setCity("Mumbai");

        org.hibernate.cfg.Configuration config =new Configuration();
        config.addAnnotatedClass(Student.class);
        config.configure("hibernate.cfg.xml");

        SessionFactory factory = config.buildSessionFactory();

        Session session=factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(s1);
        transaction.commit();

        factory.close();
        session.close();
    }


}
