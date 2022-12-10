package GenericAndCollections;

import java.util.ArrayList;
import java.util.List;

public class Casting {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("I love ArrayList");
        String myString = myList.get(0);
        System.out.println(myString);

    }
}
