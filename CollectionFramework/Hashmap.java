package CollectionFramework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        Map<String,String> map= new Hashtable<>();
            map.put("Myname", "navin");
            map.put("actor", "john");
            map.put("ceo", "Marisa");
            map.put("actor","navin");

        Set<String> keys =map.keySet();
        for(String key : keys){
            System.out.println(key+" " + map.get(key));
        }

    }
}
