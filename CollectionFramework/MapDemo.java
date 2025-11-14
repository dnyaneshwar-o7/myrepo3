package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer, String> map =new HashMap<>();

//        boolean isempty= map.isEmpty();
//        System.out.println("is this empty"+ isempty);

        map.put(101,"Red");
        map.put(102,"Green");
        map.put(103,"Blue");
        map.put(104,"Black");


        // second map

        Map<Integer,String> map2= new HashMap<>();
        map2.put(105,"White");
        map2.put(106,"grey");

//
//        map.putAll(map2);
//        System.out.println(map);
//
//        map.remove(2);
//        System.out.println(map);

        map.replace(1,"Green", "green");
        System.out.println(map);






    }
}
