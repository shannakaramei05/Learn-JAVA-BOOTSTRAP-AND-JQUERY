package Lambdas;

public class LambdaExampleWithoutParametersExample {
    interface annoucement {
        public String announce();
    }

    public static void main(String[] args) {

        // Lambda expression begins
        annoucement a = () -> {
            return "THe flight going to New York has been cancelled due to the extreem weather";
        };
        // Lambda expression ends

        System.out.println(a.announce());
    }
}
