package CollectionFramework;

import java.util.ArrayList;

//Iterate through all elements in an array list:
public class ColorIterate {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();

        colors.add("White");
        colors.add("Black");
        colors.add("Blue");

//        Insert an element into the array list at the first position:
        colors.add(1,"Yellow");
        System.out.println("updated colors list:" + colors);

        for (String color: colors){
            System.out.println(" Color name:" +color);
        }
    }
}
