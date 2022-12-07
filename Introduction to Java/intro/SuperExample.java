package intro;

public class SuperExample {
    SuperExample() {
        System.out.println("This is from the SuperExample Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Inside the main method");
        Child c = new Child();
    }

}

class Child extends SuperExample {
    Child() {
        super();
        System.out.println("Child Constructor");
    }
}