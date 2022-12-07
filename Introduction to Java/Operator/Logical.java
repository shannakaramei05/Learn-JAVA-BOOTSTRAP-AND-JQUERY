package Operator;

public class Logical {
    private int a = 10;
    private int b = 20;

    public static void main(String[] args) {
        Logical logic = new Logical();
        logic.checkBetweenAB(15);
        logic.checkBetweenAB(21);
        logic.checkBetweenAB(9);
        logic.checkLessAOrLessB(8);
        logic.checkLessAOrLessB(25);
        logic.CheckLogicalNot(false);
        logic.CheckLogicalNot(true);
    }

    public void checkBetweenAB(int x) {
        if (x >= a && x <= b) {
            System.out.println("The number " + x + " is between " + a + " and " + b);
        }
    }

    public void checkLessAOrLessB(int x) {
        if (x < a || x > b) {
            System.out.println("The number " + x + " is less than " + a + " or " + b);
        } else {
        }
        System.out.println("The number " + x + " is Greater than " + a + " or " + b);
    }

    public void CheckLogicalNot(Boolean y) {
        if (y) {
            System.out.println("y is true");
        }

        if (!y) {
            System.out.println("y is false");
        }
    }
}
