package Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext c = new ClassPathXmlApplicationContext("collection-config.xml");

        Emp1 emp1 = (Emp1) c.getBean("Emp2");
        System.out.println(emp1.getEmpName());
        System.out.println(emp1.getPhone_no());
        System.out.println(emp1.getAddresses());
        System.out.println(emp1.getCourses());
    }
}