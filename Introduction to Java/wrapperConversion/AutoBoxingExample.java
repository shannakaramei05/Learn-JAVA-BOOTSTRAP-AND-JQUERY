package wrapperConversion;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingExample {
    public static void main(String[] args) {
        List<Integer> alist = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            alist.add(i);
        }
        // System.out.println(alist.get(1));
        System.out.println(alist);
    }
}
