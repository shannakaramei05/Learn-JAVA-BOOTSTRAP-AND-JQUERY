package GenericAndCollections.SetInterface;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        // Declaring a Hashset
        HashSet<String> haset = new HashSet<String>();

        // Adding different elements including null ones
        haset.add("Apricot");
        haset.add("Mango");
        haset.add("Orange");
        haset.add("Strawberry");
        haset.add("Dates");

        // Adding duplicate Elements
        haset.add("Orange");
        haset.add("Mango");

        // Multiple null values
        haset.add(null);
        haset.add(null);

        // displaying the stored Hashset elements
        System.out.println(haset);
    }
}
