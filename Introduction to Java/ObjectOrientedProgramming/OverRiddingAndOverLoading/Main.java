package ObjectOrientedProgramming.OverRiddingAndOverLoading;

public class Main {
    public static void main(String[] args) {

        /* Overriding */
        Truck truck = new Truck();
        truck.run();
        truck.stop();
        truck.sum(2, 3);

        /* Overloading */
        OverloadMethods obj = new OverloadMethods();
        obj.displaying('A');
        obj.displaying('A', 100);
    }
}
