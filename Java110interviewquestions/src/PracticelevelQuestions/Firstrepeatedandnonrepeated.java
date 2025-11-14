package PracticelevelQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class Firstrepeatedandnonrepeated {
    public static void main(String[] args) {
        String s1 = "Programming";

        s1 = s1.toLowerCase();

        Map<Character, Integer> map1 = new LinkedHashMap<>();

        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }


        Character firstnonrepeated=null;
        for(Map.Entry<Character,Integer> entry: map1.entrySet()){
            

        }
    }
}