package AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("autowiring-config.xml");
        Employe emp1 =  context.getBean("emp1", Employe.class);
        System.out.println(emp1);
    }
}
