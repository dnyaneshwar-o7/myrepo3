package CollectionFramework;

import java.util.ArrayList;

public class ArrayListReplace {
    public static void main(String[] args) {

        ArrayList<String> List = new ArrayList<>();
        List.add("Ram");
        List.add("Shyam");
        List.add("Laxman");

        List.set(1,"Sita");

        for ( String Name: List){
            System.out.println(Name);
        }
    }
}
