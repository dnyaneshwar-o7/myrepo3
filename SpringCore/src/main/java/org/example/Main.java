package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.aot.ApplicationContextAotGenerator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        Emp emp= (Emp) context.getBean("Emp1");
        System.out.println(emp.getEmpName());
        System.out.println(emp.getCity());
        System.out.println(emp.getState());

        Emp emp2= (Emp) context.getBean("Emp2");
        System.out.println(emp2.getEmpName());
        System.out.println(emp2.getCity());
        System.out.println(emp2.getState());


    }

}