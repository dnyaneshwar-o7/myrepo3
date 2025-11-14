package PracticelevelQuestions;

import java.util.*;

public class Arrayduplicatenumberandnond {
    public static void main(String[] args) {
            int[] input = {1, 2, 2, 3, 4, 4, 5};


            Set<Integer> noDuplicates = new LinkedHashSet<>();
            for (int num : input) {
                noDuplicates.add(num);
            }

            System.out.println("Array with duplicates:");
            System.out.println(noDuplicates);

            Map<Integer, Integer> freqMap = new LinkedHashMap<>();
            for (int num : input) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }

            List<Integer> onlyUnique = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                if (entry.getValue() == 1) {
                    onlyUnique.add(entry.getKey());
                }
            }

            System.out.println("Array with non-duplicate :");
            System.out.println(onlyUnique);
        }
    }



