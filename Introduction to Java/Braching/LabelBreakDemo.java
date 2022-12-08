package Braching;

public class LabelBreakDemo {
    public static void main(String[] args) {
        int[][] arrayOne = {
                { 24, 87, 3, 18 },
                { 12, 76, 2000, 19 },
                { 22, 112, 67, 655 }
        };

        int lookFor = 12;
        int i;
        int j = 0;
        boolean numberFound = false;

        search: for (i = 0; i < arrayOne.length; i++) {
            for (j = 0; j < arrayOne[i].length; j++) {
                if (arrayOne[i][j] == lookFor) {
                    numberFound = true;
                    break search;
                }
            }
        }

        if (numberFound) {
            System.out.println("We Found " + lookFor + " at [" + i + " , " + j + "]");
        } else {
            System.out.println(lookFor + " not in this array");
        }
    }
}
