package loops;

public class ForLoopExample {
    public static void main(String[] args) {

        // Form 1
        for (int count = 1; count < 11; count++) {
            System.out.println("Current iteration is : " + count);
        }

        System.out.println("===================");

        // Form 2
        int[] count = { 1, 2, 3, 4, 5 };
        for (int num : count) {
            System.out.println("current value: " + num);
        }
    }
}
