package Braching;

public class DemoForContinue {
    public static void main(String[] args) {
        String searchP = "peter piper picked a peck of pickled peppers";
        int total = searchP.length();

        int numP = 0;

        for (int i = 0; i < total; i++) {
            // only want to count p's
            if (searchP.charAt(i) != 'p') {
                continue;
            }
            numP++;
        }
        System.out.println("We found a total of p are " + numP + " p's");

        System.out.println("=======================");
        if (numP > 5) {
            System.out.println("we found more than 5 p's. Hence exiting the method.");
        } else {
            System.out.println("We found a total of " + numP + " p's");
        }
    }
}
