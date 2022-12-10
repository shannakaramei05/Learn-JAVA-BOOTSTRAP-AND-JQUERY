package GenericAndCollections.Overriding;

public class ToStringExampleWithOverriddenToString {
    public static void main(String[] args) {
        ToStringExampleWithOverriddenToString exampleOne = new ToStringExampleWithOverriddenToString();
        System.out.println(exampleOne.toString());
    }

    public String toString() {
        return "This is an overriden Method";
    }

}
