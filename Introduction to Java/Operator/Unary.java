package Operator;

public class Unary {
    public static void main(String[] args) {
        int a = 1;
        Boolean b = false;

        // result = 1
        System.out.println("Result of +a : " + +a);

        // result is now -1
        System.out.println("Result of -a : " + -a);

        // reuslt is now 0
        System.out.println("result of a-- : " + a--);

        // result is now 1
        System.out.println("Result of a++ :" + a++);

        // false ._.
        System.out.println("Result of boolean b : " + b);

        // true
        System.out.println("Result of complement boolean b : " + !b);
    }
}
