package CollectionFramework;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //Add method
        list.add("Blue");
        list.add(1,"yellow");
        list.add("black");
        list.add("White");
//        System.out.println("List of the color" +list);

        //Remove Method
//        list.remove("Blue");
//        list.remove(1);
//        System.out.println(list);

        //access elementns by using get and iterator
//        list.get(2);
//        System.out.println(list);

        list.iterator();
        System.out.println(list);

    }
}
