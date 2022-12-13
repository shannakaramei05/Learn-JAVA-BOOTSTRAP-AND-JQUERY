package Lambdas;

public class SImpleMethodExample {
    public void printDemo(String simpleText) {
        System.out.println(simpleText);
    }

    public static void main(String[] args) {
        // creating an instance of the object for our LambdaExample class

        SImpleMethodExample smEx = new SImpleMethodExample();

        // Assign a value to the object's String
        String simpleText = "A Simple String";
        smEx.printDemo(simpleText);
    }

}
