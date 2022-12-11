package GenericAndCollections.CollectionsExample;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> trmap = new TreeMap<Integer, String>();
        trmap.put(1, "Object 1");
        trmap.put(17, "Object 2");
        trmap.put(50, "Object 3");
        trmap.put(7, "Object 4");
        trmap.put(3, "Object 5");

        Set set = trmap.entrySet();
        Iterator iterator1 = set.iterator();

        while (iterator1.hasNext()) {
            Map.Entry ment = (Map.Entry) iterator1.next();
            System.out.println("Key is: " + ment.getKey() + " and Value is: " + ment.getValue());
        }

    }

}
