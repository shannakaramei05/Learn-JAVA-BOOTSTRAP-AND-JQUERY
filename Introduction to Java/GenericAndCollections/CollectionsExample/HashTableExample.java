package GenericAndCollections.CollectionsExample;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Enumeration enumeration;
        String keys;
        Hashtable<String, String> hashTable = new Hashtable<String, String>();
        hashTable.put("key1", "Adam");
        hashTable.put("key2", "Brian");
        hashTable.put("key3", "Charles");
        hashTable.put("key4", "Dean");
        hashTable.put("key5", "Peter");

        System.out.println(hashTable);
        enumeration = hashTable.keys();

        while (enumeration.hasMoreElements()) {
            keys = (String) enumeration.nextElement();
            System.out.println("key is " + keys + " & value is " + hashTable.get(keys));
        }
    }
}
