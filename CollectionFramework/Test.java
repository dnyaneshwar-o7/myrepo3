package CollectionFramework;

import java.util.Arrays;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        linkedList.addFirst(11);
        linkedList.addLast(6);
        linkedList.getFirst();
        linkedList.getLast();

        System.out.println(linkedList);
        linkedList.removeIf(x -> x%2==0);
        System.out.println(linkedList);

        LinkedList<String> animals= new LinkedList<>(Arrays.asList("cat","Dog","Elephant"));
        LinkedList<String> animalsToremove = new LinkedList<>(Arrays.asList("Dog","lion"));

        animals.removeAll(animalsToremove);
        System.out.println(animals);


    }
}
