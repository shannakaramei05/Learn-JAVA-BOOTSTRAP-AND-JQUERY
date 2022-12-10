package GenericAndCollections.Overriding;

public class Student {
    int rollNo;
    String name;
    String city;

    Student(int rollNo, String name, String city) {
        this.rollNo = rollNo;
        this.name = name;
        this.city = city;
    }

    public static void main(String[] args) {

        // Without toString();
        Student studentOne = new Student(101, "Nerd", "North");
        Student studentTwo = new Student(102, "Jack", "West");

        System.out.println("StudentOne : " + studentOne.toString());
        System.out.println("StudentTwo : " + studentTwo.toString());
    }
}
