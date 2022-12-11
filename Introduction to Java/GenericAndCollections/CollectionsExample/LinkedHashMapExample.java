package GenericAndCollections.CollectionsExample;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Declaring a HashMap
        LinkedHashMap<Integer, String> lihaMap = new LinkedHashMap<Integer, String>();
        // Adding the element to this collection
        lihaMap.put(21, "Abe");
        lihaMap.put(23, "Drown");
        lihaMap.put(1, "Jack");
        lihaMap.put(3, "Karen");
        lihaMap.put(100, "Lin");

        // Generating the required set
        Set set1 = lihaMap.entrySet();

        // Displaying elements from this collection map
        Iterator iterator1 = set1.iterator();

        while (iterator1.hasNext()) {
            Map.Entry me = (Map.Entry) iterator1.next();
            System.out.println("The Key: " + me.getKey() + " and value is: " + me.getValue() + "\n");
        }

    }
}
