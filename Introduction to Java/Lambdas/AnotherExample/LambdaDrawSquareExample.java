package Lambdas.AnotherExample;

public class LambdaDrawSquareExample {
    public static void main(String[] args) {
        int area = 5;

        // Lambda expression strats. An instae ds of the interface is take as parameter.
        // Note that the absence of the parameters is repesented by an empty round
        // bracket

        drawSquare ds = () -> {
            System.out.println("The Square is drawn for the area " + area);
        };

        // the concrete implementation provide by the lambda expression dras the square
        // from the functional interface's method

        ds.drawIt();
    }
}
