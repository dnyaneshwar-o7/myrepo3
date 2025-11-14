package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.Alias;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Alien a1 =new Alien();
        a1.setAname("navin");
        a1.setTech("java");


        Address ad=new Address();
        ad.setStreet("Strret1");
        ad.setCity("DELHI");
        ad.setIsopen(true);
        ad.setAddeddate(new Date());
        ad.setX(1234.567);

        Address ada=new Address();
        ada.setStreet("Strret1");
        ada.setCity("DELHI");
        ada.setIsopen(true);
        ada.setAddeddate(new Date());
        ada.setX(1234.567);


      Configuration config =new Configuration();
        config.addAnnotatedClass(Alien.class);
        config.configure("hibernate.cfg.xml");

        SessionFactory factory = config.buildSessionFactory();

        Session session=factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(a1);
        session.persist(ad);


        transaction.commit();
        transaction.rollback();

        factory.close();
        session.close();
        System.out.println("Done...");


    }

}