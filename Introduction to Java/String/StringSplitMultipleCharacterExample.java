public class StringSplitMultipleCharacterExample {
    public static void main(String[] args) {

        String myStr = "My, Favorite @Programming?Language.Java";
        String[] arrOfStr = myStr.split("[, ?.@]+");

        for (String str : arrOfStr) {
            System.out.println(str);
        }
    }
}
