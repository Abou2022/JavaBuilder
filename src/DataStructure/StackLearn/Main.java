package DataStructure.StackLearn;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println(stack.peek());

        ArrayDeque<Integer> myNumber = new ArrayDeque<>();

        myNumber.push(0);
        myNumber.push(1);
        myNumber.push(2);
        myNumber.push(3);
        myNumber.push(4);
        myNumber.push(5);
        myNumber.push(6);
        myNumber.push(7);
        myNumber.push(8);
        myNumber.push(9);
        myNumber.push(10);

//        While(!myNumber.isEmpty()) {
//            System.out.println(myNumber.pop());
//        }

        while (!myNumber.isEmpty()){
            System.out.println(myNumber.pop());
        }



    }
}
