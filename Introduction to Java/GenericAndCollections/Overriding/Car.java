package GenericAndCollections.Overriding;

public class Car {
    private String brand;
    private String model;
    private String registrationNumber;

    Car(String brand, String model, String regString) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
    }

    public boolean equals(Object o) {
        if (o instanceof Car) {
            Car car = (Car) o;
            if (car.getBrand() == this.brand && car.getModel() == this.model
                    && this.getRegistrationNumber() == this.registrationNumber) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrandn(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
