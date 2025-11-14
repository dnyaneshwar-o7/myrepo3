package InjectingReference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("referAB-config.xml");
        A Temp = (A) context.getBean("Arefer");
        System.out.println(Temp.getX());
        System.out.println(Temp.getObj().getY());
        System.out.println(Temp);

    }
}
