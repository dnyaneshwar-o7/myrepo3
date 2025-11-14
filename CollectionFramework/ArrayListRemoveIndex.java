package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveIndex {
    public static void main(String[] args) {

        ArrayList<String> List =new ArrayList<>();
        List.add("One");
        List.add("Five");
        List.add("Two");
        List.add("Three");
        System.out.println("Before Remove the list " + List);

        Boolean List2= List.remove("Five");
        System.out.println(List2);

         List2 = List.remove("Three");
        System.out.println(List2);

        System.out.println(List);
    }
}
