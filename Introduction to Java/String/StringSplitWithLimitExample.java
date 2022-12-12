public class StringSplitWithLimitExample {
    public static void main(String[] args) {
        String myStr = "I@Love@Java";
        String[] arrOfStr = myStr.split("@", 2);

        for (String str : arrOfStr) {
            System.out.println(str);
        }
    }
}
