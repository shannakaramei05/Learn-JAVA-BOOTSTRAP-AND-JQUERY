package ObjectAssignment;

public class Main {
    public static void main(String[] args) {

        // with overriden
        Animal dogObj = new Dog();
        dogObj.makeSound();

        // without overriden
        Animal dogObj2 = new DogWithoutOverriden();
        dogObj.makeSound(); // result should be same with overiden
    }
}
