package CollectionFramework;

import javax.naming.Name;
import java.util.ArrayList;

public class ArrayListAddAll {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<>();

        List.add("Apple");
        List.add("Banana");
        List.add("Cocount");

        ArrayList<String> List2=new ArrayList<>();

        List2.add("Pappy");
        List2.add("Grapes");

        List.addAll(List2);

        for (String Name : List){
            System.out.println(Name);
        }
    }
}
