package CollectionFramework;

import java.util.ArrayList;

public class ArrayListSpecifiedIndex {
    public static void main(String[] args) {

        ArrayList<String>  List =new ArrayList<>();

        List.add("Java");
        List.add("Script");
        List.add("Super");
        List.add("Core");

        List.add(1,"Advance Java");

        System.out.println(List);

    }
}
