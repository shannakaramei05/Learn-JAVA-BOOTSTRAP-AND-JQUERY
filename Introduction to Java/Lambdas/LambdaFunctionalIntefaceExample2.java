package Lambdas;

public class LambdaFunctionalIntefaceExample2 {
    interface printingSomeText {
        void print(String anyValue);
    }

    public void printLambdaText(String lambdaText, printingSomeText pst) {
        pst.print(lambdaText);
    }

    public static void main(String[] args) {
        LambdaFunctionalIntefaceExample2 lmd2 = new LambdaFunctionalIntefaceExample2();
        String lambdaText = "Understanding Lambdas";

        printingSomeText pst = new printingSomeText() {
            @Override
            public void print(String anyValue) {
                System.out.println(anyValue);
            }
        };
        lmd2.printLambdaText(lambdaText, pst);
    }

}
