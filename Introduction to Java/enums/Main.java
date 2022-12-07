package enums;

public class Main {
    public static void main(String[] args) {
        EnumExample carOne = new EnumExample(CarTypes.Sport);
        carOne.carFeatures();

        EnumExample carTwo = new EnumExample(CarTypes.Hatchback);
        carTwo.carFeatures();

        EnumExample carThree = new EnumExample(CarTypes.Mini);
        carThree.carFeatures();
    }
}
