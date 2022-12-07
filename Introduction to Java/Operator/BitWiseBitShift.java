package Operator;

public class BitWiseBitShift {
    public static void main(String[] args) {
        int x = 30;
        int y = 60;
        int z = 300;
        int k = 55;
        int l = 15;
        int output;

        /*
         * performs bitwise complement operation
         * it simply inverts the bit pattern by
         * changing every 0 to 1, and every 1 to 0
         */
        output = ~k;
        System.out.println(output); // -56

        /*
         * perfoms bitwise Xor Operation
         * compares the close by bits.
         * if found same, it returns 0 else 1
         */

        output = x ^ y;
        System.out.println(output); // 34

        /*
         * performs bitwise AND operation
         * compares the colse by bits
         * if found both bits as 1, return 1 else 0
         */

        output = x & y;
        System.out.println(output); // 28

        /*
         * perfoms bitwise OR operation
         * compares the close by bits.
         * if found either of bit 1, return 1 else 0
         */

        output = x | y;
        System.out.println(output); // 62

        /*
         * perfoms signed left shift operation
         * it shifts a bit patter to the left by number of specified bits
         * the low-order postions bits are filled with zero bits
         */

        System.out.println(z << 0);
        System.out.println(z << 2);
        System.out.println(z << 6);

        /*
         * perfoms signed right shit operation
         * it shifts a biit pattern to the right bt number of specified bits.
         */

        System.out.println(z >> 0);
        System.out.println(z >> 1);
        System.out.println(z >> 6);

        System.out.println(1 >>> 1); // perfom unsigned right shift operation
    }

}
