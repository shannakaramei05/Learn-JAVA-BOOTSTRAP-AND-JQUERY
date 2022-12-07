package intro;

public class GymCustomer {
    private int age;
    private int height;
    private String name;
    private String gender;

    public GymCustomer(int age, int height, String name, String gender) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.gender = gender;

    }

    public void printGymCustomerData() {
        System.out.println("Name : " + this.name + " - Gender : "
                + this.gender + " - Age : " + this.age + " - Height : " + this.height);
    }
}
