package ImplementMethodUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("ImplementMethod-config.xml");
        Samosa s1= (Samosa) context.getBean("s1");
        System.out.println(s1.getPrice());
    }
}
