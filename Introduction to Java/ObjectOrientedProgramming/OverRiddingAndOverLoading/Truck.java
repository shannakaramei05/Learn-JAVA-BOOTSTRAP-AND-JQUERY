package ObjectOrientedProgramming.OverRiddingAndOverLoading;

public class Truck extends Transport {
    /*
     * When we passing value in the function
     * the parameter should be same with the superclass (Transport)
     */
    @Override
    void stop() {
        System.out.println("STOP from overriding.!");
    }

}
