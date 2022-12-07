package enums;

public class EnumExample {
    CarTypes carTypes;

    public EnumExample(CarTypes carTypes) {
        this.carTypes = carTypes;
    }

    public void carFeatures() {
        switch (carTypes) {
            case Sport:
                System.out.println("Stylish car with Power");
                break;
            case Hybrid:
                System.out.println("Economical as partially runs on battery power");
                break;
            case Hatchback:
            case SUV:
                System.out.println("Rear door swings upward to provide access to the cargo");
                break;
            default:
                System.out.println("Just a car");
                break;
        }
    }
}
