package GenericAndCollections.SetInterface;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        // Creating a LinkedHashSet for String
        LinkedHashSet<String> myLinkedHasSet = new LinkedHashSet<String>();

        // Adding different elents to the LinkedHaset
        myLinkedHasSet.add("Z");
        myLinkedHasSet.add("R");
        myLinkedHasSet.add("M");
        myLinkedHasSet.add("O");
        myLinkedHasSet.add("KKK");
        myLinkedHasSet.add("EFG");

        System.out.println(myLinkedHasSet);

        // Now Creating a lInkedHasSet for INteger
        LinkedHashSet<Integer> myLinkedHashSet2 = new LinkedHashSet<Integer>();

        // Adding integer elements
        myLinkedHashSet2.add(95);
        myLinkedHashSet2.add(13);
        myLinkedHashSet2.add(0);
        myLinkedHashSet2.add(55);
        myLinkedHashSet2.add(33);
        myLinkedHashSet2.add(61);

        System.out.println(myLinkedHashSet2);
    }
}
