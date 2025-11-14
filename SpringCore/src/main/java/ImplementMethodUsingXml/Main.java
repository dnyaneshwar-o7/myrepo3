package ImplementMethodUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("ImplementMethod-config.xml");
       context.registerShutdownHook();
        Pepsi p1= (Pepsi) context.getBean("pepsi");
        System.out.println(p1.getPrice());
    }
}
