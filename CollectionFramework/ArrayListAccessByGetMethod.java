package CollectionFramework;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAccessByGetMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);

        System.out.println(list);

        list.add(1,500);
        System.out.println(list);
//
//        List<Integer> newlist= new ArrayList();
//        newlist.add(150);
//        newlist.add(160);
//
//        list.addAll(newlist);
//        System.out.println(list);
//









//        System.out.println(List.get(4));
//
//        for(int i=0; i<List.size(); i++) {
//
//            System.out.println(List.get(i));
//    }


//        Iterator iterator= List.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
