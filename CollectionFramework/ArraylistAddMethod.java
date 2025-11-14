package CollectionFramework;

import java.util.ArrayList;

public class ArraylistAddMethod {
    public static void main(String[] args) {

        ArrayList<String> List = new ArrayList<>();

        List.add("Java");
        List.add("Goal");
        List.add("Super");

        boolean ListNoFour = List.add("SuperJava");
        System.out.println(ListNoFour);

        for (String Name : List) {
            System.out.println(Name);

        }
    }
}
