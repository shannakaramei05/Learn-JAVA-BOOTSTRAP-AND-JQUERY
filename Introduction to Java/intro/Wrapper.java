package intro;

public class Wrapper {
    public static void main(String[] args) {

        /* Primitive Examples */
        Integer i = new Integer(10);
        Float f = new Float(5.5f);
        Boolean b = new Boolean(true);

        Integer ii = new Integer("10");
        Float ff = new Float("5.5f");
        Character ch = new Character('c');
        Boolean bb = new Boolean("true");

        /* Example */
        Integer number = new Integer(42);
        byte bt = number.byteValue();

        System.out.println("Byte: " + bt);

        short s = number.shortValue();
        System.out.println("Short: " + s);

        double ddd = number.doubleValue();
        System.out.println("Double: " + ddd);

        /* Trying to use Parse */
        System.out.println("=====================================");
        double doubleValue = Double.parseDouble("5.5");
        System.out.println("double parse: " + doubleValue);

        long l = Long.parseLong("101010", 2);
        System.out.println("parse long: " + l);
    }
}
