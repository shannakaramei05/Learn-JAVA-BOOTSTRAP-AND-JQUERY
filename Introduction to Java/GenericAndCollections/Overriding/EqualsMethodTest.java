package GenericAndCollections.Overriding;

public class EqualsMethodTest {
    public static void main(String[] args) {
        Car myCar = new Car("Mercedes Benz", "S Class", "MH05 12345");
        Car carInGarage = new Car("Mercedes Benz", "S Class", "MH05 12345");

        if (myCar.equals(carInGarage)) {
            System.out.println("That's my Car bro!");
        }

        if ("aku".equals("merdeka")) {
            System.out.println("aku Merdeka");
        }
    }
}
