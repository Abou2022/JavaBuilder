package DataStructure.QueueLearn;
import java.util.*;
class Main {
    public static void main(String[] args) {

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        System.out.println(queue.peek());

        ArrayDeque <String> myqueue = new ArrayDeque<>();
        myqueue.offer("Zero");
        myqueue.offer("One");
        myqueue.offer("Two");
        myqueue.offer("Three");
        myqueue.offer("Four");
        myqueue.offer("Five");

        for(String myqueues: myqueue){
            System.out.println(myqueues);
        }

    }
}
