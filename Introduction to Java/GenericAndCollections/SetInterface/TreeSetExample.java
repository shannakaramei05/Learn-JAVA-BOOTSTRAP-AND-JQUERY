package GenericAndCollections.SetInterface;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a String Type TreeSet
        TreeSet<String> tset = new TreeSet<String>();

        // Adding various String elements to the above TreeSet
        tset.add("EFG");
        tset.add("Stores");
        tset.add("Tests");
        tset.add("Pens");
        tset.add("Ink");
        tset.add("Jane");

        // Displaying the collection of TreeSet elements
        System.out.println(tset);
    }
}
