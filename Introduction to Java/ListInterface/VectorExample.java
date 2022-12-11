package ListInterface;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
    // Setting up initial size and increments
    public static void main(String[] args) {
        Vector myVector = new Vector(3, 2);
        System.out.println("Initial Size is: " + myVector.size());
        System.out.println("Initial capacity is: " + myVector.capacity());

        // Adding elements
        myVector.add(new Integer(1));
        myVector.add(new Integer(2));
        myVector.add(new Integer(3));
        myVector.add(new Integer(4));

        System.out.println("The Capacity after four additions is: " + myVector.capacity());
        myVector.add(new Double(6.55));
        System.out.println("Now Capacity is: " + myVector.capacity());
        myVector.add(new Double(5.35));
        myVector.add(new Integer(8));
        System.out.println("Now Capacity is: " + myVector.capacity());
        myVector.add(new Float(9.5));
        myVector.add(new Integer(10));
        System.out.println("Now Capacity is: " + myVector.capacity());
        myVector.add(new Integer(11));
        myVector.add(new Integer(12));
        System.out.println("First Element is: " + (Integer) myVector.firstElement());
        System.out.println("Last Element is: " + (Integer) myVector.lastElement());

        if (myVector.contains(new Integer(3))) {
            System.out.println("Vector contains 3.");
        }

        // Enumerate the vector elements
        Enumeration vecEnum = myVector.elements();
        System.out.println("\nElements in the vector:");
        while (vecEnum.hasMoreElements()) {
            System.out.print(vecEnum.nextElement() + " ");
        }

    }
}
