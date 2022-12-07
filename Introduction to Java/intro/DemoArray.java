package intro;

public class DemoArray {
    public static void main(String[] args) {
        int[] oneArray;
        // initiate an integer array
        oneArray = new int[5];

        // set up 5 memory locations for the array
        oneArray[0] = 122;
        oneArray[1] = 212;
        oneArray[2] = 58;
        oneArray[3] = 125;
        oneArray[4] = 200;

        // we store 5 seperate integers in successive positions
        System.out.println("first element is : " + oneArray[0]);
        System.out.println("second element is : " + oneArray[1]);
        System.out.println("third element is : " + oneArray[2]);
        System.out.println("fourth element is : " + oneArray[3]);
        System.out.println("fifth element is : " + oneArray[4]);

        /* Demo Array Multi */
        String[][] salName = { { "Mr. ", "Mrs. ", "Ms. " }, { "Alan", "Janice" } };

        // we have elements for only two rows out of there
        System.out.println("The first combine value is : " + salName[0][0] + salName[1][0]);
        System.out.println("The Second Combined values is " + salName[0][2] + salName[1][1]);
    }

}
