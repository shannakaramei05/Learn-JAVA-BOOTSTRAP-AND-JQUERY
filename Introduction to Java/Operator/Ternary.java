package Operator;

public class Ternary {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean c;

        // following expression checks if the value of a is less than b
        c = a < b ? true : false;
        System.out.println("value of c : " + c);
    }
}
