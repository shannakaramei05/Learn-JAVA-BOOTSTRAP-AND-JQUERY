public class StringSplitExample {
    public static void main(String[] args) {
        String myStr = "My Favorite Programming Language :Java";
        String[] arrOfStr = myStr.split(":");
        System.out.println(arrOfStr);

        for (String piece : arrOfStr) {
            System.out.println(piece);
        }
    }
}
