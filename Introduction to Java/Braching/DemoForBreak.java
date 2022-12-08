package Braching;

public class DemoForBreak {
    public static void main(String[] args) {
        int[] intArray = { 68, 25, 74, 33, 95, 17, 53, 28, 1986, 53 };

        int index;
        int regNum = 17;
        boolean found = false;

        for (index = 0; index < intArray.length; index++) {
            if (intArray[index] == regNum) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("We found " + regNum + " at the array index of " + index);
        } else {
            System.out.println(regNum + " is not stored in the array");
        }
    }

}
