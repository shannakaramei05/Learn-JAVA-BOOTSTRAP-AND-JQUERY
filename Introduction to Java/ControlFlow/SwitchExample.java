package ControlFlow;

public class SwitchExample {
    public static void main(String[] args) {
        int numSides = 5;
        switch (numSides) {
            case 3:
                System.out.println("It is triangle");
                break;

            case 4:
                System.out.println("It is Quadrilateral");
                break;
            case 5:
                System.out.println("It is pentangon");
                break;
            case 6:
                System.out.println("It is hexagon");
                break;
            default:
                System.out.println("It is Polygon more than six sides");
        }
    }
}
