package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Creating the empty priority queue
        PriorityQueue<String> prQueue = new PriorityQueue<String>();
        // Adding the items
        prQueue.add("C");
        prQueue.add("Java");
        prQueue.add("Python");
        prQueue.add("C++");

        // printing the most priority element
        System.out.println("The head value by using peek function is: " + prQueue.peek());

        // printing all elements
        System.out.println("The total queue elements are: ");
        Iterator iterator1 = prQueue.iterator();

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        // now removing the top priority elements (of head queue)
        // printing the modified PriorityQueue

        prQueue.poll();
        System.out.println("\nAfter removing an element with poll function: ");
        Iterator<String> itr2 = prQueue.iterator();

        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        // removing one value (java)
        prQueue.remove("Java");
        System.out.println("\nAfter removing Java with remove function : ");
        Iterator<String> itr3 = prQueue.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }

        // Checking a praticular elements in the PriorityQueue
        boolean a = prQueue.contains("C");
        System.out.println("Does this queue contains C ? " + a);

    }
}
