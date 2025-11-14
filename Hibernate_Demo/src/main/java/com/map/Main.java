package com.map;

import com.example.Alien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

//        org.hibernate.cfg.Configuration config =new Configuration();
//        config.configure("hibernate.cfg.xml");
//        SessionFactory factory = config.buildSessionFactory();

//        Creating question
        Question q1=new Question();
        q1.setQuestionId(1231);
        q1.setQuestion("What is java");

//        Creating answer

        Answer a1=new Answer();
        a1.setAnswerId(343);
        a1.setAnswer("Java is programming language");
        a1.setAnswer(q1.getQuestion());
        q1.setAnswer(new Answer());

//           Creating question
        Question q2=new Question();
        q2.setQuestionId(1231);
        q2.setQuestion("What is collection Framework");

//        Creating answer

        Answer a2=new Answer();
        a2.setAnswerId(343);
        a2.setAnswer("API work to with object in java");
        a2.setAnswer(q1.getQuestion());
        q2.setAnswer(new Answer());

        org.hibernate.cfg.Configuration config =new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();

        Session s = factory.openSession();
        Transaction tx =s.beginTransaction();

        s.persist(q1);
        s.persist(q2);
        s.persist(a1);
        s.persist(a2);
        tx.commit();

        factory.close();
        s.close();
        System.out.println("Done...");






    }
}
