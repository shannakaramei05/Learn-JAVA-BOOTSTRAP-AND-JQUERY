package Lambdas;

public class LambdaExmapleExpressionSingleParameter {
    interface annoucement {
        // adding a parameter to the method with a String variable
        public String annouce(String anyText);
    }

    public static void main(String[] args) {
        // First Lambda expression begins

        annoucement a1 = (anyText) -> { // Adding single parameter with optional round brackets
            return "We have an important annoucement to be made. " + anyText;
        }; // First lambda expression ends

        System.out.println(a1.annouce("The flight going to New York has been cancelled due to the extreme weather"));

        // second lambda expression begins
        annoucement a2 = anyText -> { // without bracket
            return "We have an important annoucement to be made. " + anyText;
        };

        // Second lambda ends
        System.out
                .println(a2.annouce("The flight going to the Boston has been canceleld due to the hailstrom."));
    }
}
