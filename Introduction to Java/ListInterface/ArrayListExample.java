package ListInterface;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // First setting the size of ArrayList
        int size = 5;

        // Now Declaring ArrayList with that size
        ArrayList<Integer> arrList = new ArrayList<Integer>(size);
        for (int i = 1; i <= size; i++) {
            arrList.add(i);
        }

        System.out.println(arrList);

        // remove index 2
        arrList.remove(2);
        System.out.println(arrList);

    }

}
