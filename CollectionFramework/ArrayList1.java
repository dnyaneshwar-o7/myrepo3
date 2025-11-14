package CollectionFramework;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> arrlist=new ArrayList<>();
        arrlist.add("black");
        arrlist.add("Whaite");
        arrlist.add("Blue");
        arrlist.add("Yellow");

        System.out.println("Colors in arraylist" + arrlist);

        arrlist.set(1,"pink");
        

    }
}
