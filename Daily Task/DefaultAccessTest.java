package AccessModifiers.P1;

//import AccessModifiers.P2.DefaultAccessClass;
import AccessModifiers.P2.DefaultAccessTest2;

public class DefaultAccessTest extends DefaultAccessTest2{

    public static void main(String[] args) {
        DefaultAccessTest2 obj = new DefaultAccessTest2();
        obj.publicMethod();
      //  obj.protectedMethod();

        DefaultAccessTest ppp = new DefaultAccessTest();
        ppp.publicMethod();
        ppp.protectedMethod();

        //DefaultAccessClass oo = new DefaultAccessClass();

    }

}
