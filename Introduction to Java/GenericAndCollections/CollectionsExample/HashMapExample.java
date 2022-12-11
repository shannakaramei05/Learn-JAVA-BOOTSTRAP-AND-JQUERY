package GenericAndCollections.CollectionsExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();
        hmap1.put(14, "George");
        hmap1.put(33, "Paul");
        hmap1.put(16, "Jane");
        hmap1.put(7, "Brian");
        hmap1.put(19, "Jack");

        // cek the hashmap
        System.out.println(hmap1);

        Set set1 = hmap1.entrySet();
        System.out.println("set1 : " + set1);
        Iterator iterator1 = set1.iterator();
        System.out.println("iterator1 : " + iterator1); // for looping

        while (iterator1.hasNext()) {
            Map.Entry ment1 = (Map.Entry) iterator1.next();
            System.out.println("Value : " + ment1.getValue() + " || " + "Key : " + ment1.getKey());
        }

        System.out.println("================================");
        String va = hmap1.get(2); // null
        System.out.println("index 2 has value of " + va);
        System.out.println("================================");

        hmap1.remove(16);
        Set set2 = hmap1.entrySet();
        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Map.Entry ment2 = (Map.Entry) iterator2.next();
            System.out.println("Value : " + ment2.getValue() + " || " + "Key : " + ment2.getKey());
        }

    }
}
