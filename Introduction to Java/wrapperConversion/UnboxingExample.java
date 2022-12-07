package wrapperConversion;

import java.util.ArrayList;
import java.util.List;

public class UnboxingExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(15);
        nums.add(20);
        System.out.println("Total is " + addNumbers(nums));
    }

    public static int addNumbers(List<Integer> nums) {
        int total = 0;
        for (Integer num : nums) {
            total += num;
        }
        return total;
    }
}
