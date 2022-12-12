public class StringObjectComparison {
    public static void main(String[] args) {
        // The following strings are being created using literals
        String literal1 = "xyz";
        String literal2 = "xyz";

        System.out.print("Comparison using == operator for literals: ");
        System.out.println(literal1 == literal2);

        // Creating string using operator
        String keyword1 = new String("abc");
        String keyword2 = new String("abc");

        System.out.print("Comparison usng == for objects : ");
        System.out.println(keyword1 == keyword2);
    }
}
