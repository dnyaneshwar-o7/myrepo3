package ObjectClassmethods;

public class hascodeMethod {

    String name;

    public hascodeMethod(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        hascodeMethod s1= new hascodeMethod("ram");
        hascodeMethod s2= new hascodeMethod("shyam");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        //equals methods
        System.out.println(s1==s2);
    }
}
