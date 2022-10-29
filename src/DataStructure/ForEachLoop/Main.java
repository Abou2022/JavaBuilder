package DataStructure.ForEachLoop;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> intListExample = ListCreator.generateIntArrayList();
        System.out.println("Integers you added to the first list:");
        for (Integer num : intListExample) {
            System.out.println(num);
        }

        List<Integer> intList = ListCreator.generateIntArrayList();
        int max = intList.get(0);

        for(Integer maximum : intList){
            System.out.println("Maximum number in second list: " + maximum);
        }

        System.out.println("Maximum number in second list: " + max);

    }
}
