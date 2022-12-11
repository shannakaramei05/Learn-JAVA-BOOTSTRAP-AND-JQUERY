package ListInterface;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();

        // Adding elements in various orders and positions
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");
        myList.add(2, "e");
        myList.add("f");
        myList.add("g");

        System.out.println("Linked list is: " + myList);

        // Now Removing elements from the linked list using difference options
        myList.remove("b");
        myList.remove(3);
        myList.removeFirst();
        myList.removeLast();
        System.out.println("New Linked list using difference options " + myList);

        // Finding elements in the linked list
        boolean stats = myList.contains("e");
        if (stats) {
            System.out.println("List contains e");
        } else {
            System.out.println("list doesn't contains e");
        }

        // other information
        int size = myList.size();
        System.out.println("size : " + size);
    }

}
