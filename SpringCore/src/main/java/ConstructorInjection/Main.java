package ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext a=new ClassPathXmlApplicationContext("constructor-config.xml");
        Addition addition = (Addition) a.getBean("add");
       addition.dosum();
    }
}
