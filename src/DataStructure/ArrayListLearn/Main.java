package DataStructure.ArrayListLearn;

import java.util.ArrayList;
import java.util.*;
public class Main {

        public static void main(String[] args) {
            ArrayList<String> instruments = new ArrayList<String>();

            // You can create a string with a name then add it to the arraylist.
            String drums = "Drums";
            instruments.add(drums);
            String violin = "Violin";
            instruments.add(violin);

            // You can also create the string while adding it to the arraylist as well
            instruments.add("Guitar");
            instruments.add(new String("Piano"));

            for (int i = 0; i < instruments.size(); i++) {
                System.out.println(instruments.get(i));
            }
            instruments.remove("Violin");

            System.out.println();
            for (int i = 0; i < instruments.size(); i++) {
                System.out.println(instruments.get(i));
            }
            //call the remove() method once more, but this time, we'll use an index value
            instruments.remove(1);

            System.out.println();
            for (int i = 0; i < instruments.size(); i++) {
                System.out.println(instruments.get(i));
            }
            ArrayList <Integer> number = new ArrayList<>();

            number.add(15);
            number.add(22);
            number.add(99);
            number.add(75);
            number.add(16);
            number.add(2);
            number.add(3, 4);

            for (int i = 0; i < number.size(); i++){
                System.out.println(number.get(i));
            }
            Collections.reverse(number);

            for (int i = 0; i < number.size(); i++){
                System.out.println(number.get(i));
            }

        }

}
