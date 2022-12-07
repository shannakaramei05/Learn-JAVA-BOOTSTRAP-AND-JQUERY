package firstProgram;

public class MyFirstProgram {
    public static void main(String[] args) {
        // creates an object prom LearnJavaProgramming

        LearnJavaProgramming firstFeedback = new LearnJavaProgramming();
        LearnJavaProgramming secondFeedback = new LearnJavaProgramming();

        // Set the feedback value
        firstFeedback.setFeedback("First Object - I Love Java");
        secondFeedback.setFeedback("Second Object - I Love Java");

        // print the feedback
        firstFeedback.printFeedback();
        secondFeedback.printFeedback();
    }
}
