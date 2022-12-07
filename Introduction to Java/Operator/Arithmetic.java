package Operator;

public class Arithmetic {
    public static void main(String[] args) {

        int x = 20;
        int y = 15;

        Arithmetic expArithmetic = new Arithmetic();
        int additionResult = expArithmetic.doAddition(x, y);
        int subtractionResult = expArithmetic.doSubtraction(x, y);
        int divisionResult = expArithmetic.doDivision(x, y);
        int multiplicationResult = expArithmetic.doMultiplication(x, y);
        int remainderResult = expArithmetic.doRemainder(x, y);
        System.out.println("AdditionResult : " + additionResult + "\n" +
                "SubtractionResult : " + subtractionResult + "\n" +
                "divisionResult : " + divisionResult + "\n" +
                "multiplicationResult : " + multiplicationResult + "\n" +
                "remainderResult : " + remainderResult

        );
    }

    public Integer doAddition(int x, int y) {
        return x + y;
    }

    public Integer doSubtraction(int x, int y) {
        return x - y;
    }

    public Integer doDivision(int x, int y) {
        return x / y;
    }

    public Integer doMultiplication(int x, int y) {
        return x * y;
    }

    public Integer doRemainder(int x, int y) {
        return x % y;
    }

}
