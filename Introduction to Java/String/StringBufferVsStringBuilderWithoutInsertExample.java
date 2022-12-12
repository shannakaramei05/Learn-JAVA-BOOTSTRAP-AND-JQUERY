import java.util.GregorianCalendar;

public class StringBufferVsStringBuilderWithoutInsertExample {
    public static void main(String[] args) {
        System.gc();

        StringBuffer myStrBuffer = new StringBuffer();
        StringBuilder myStrBuilder = new StringBuilder();

        runStringBuilder(myStrBuilder);

        // Request Grabage Collection to clear the memory
        System.gc();
        runStringBuffer(myStrBuffer);
    }

    private static void runStringBuilder(StringBuilder myStr) {
        long begin = new GregorianCalendar().getTimeInMillis();
        long initiateMemory = Runtime.getRuntime().freeMemory();

        for (int j = 0; j < 5000000; j++) {
            myStr.append(":" + j);
        }

        long finish = new GregorianCalendar().getTimeInMillis();
        long stopMemory = Runtime.getRuntime().freeMemory();
        System.out.println("Time Taken for String Builder Append : " + (finish - begin));
        System.out.println("Memory used String Builder Append :" + (initiateMemory - stopMemory));

    }

    private static void runStringBuffer(StringBuffer myStr) {
        long begin = new GregorianCalendar().getTimeInMillis();
        long initiateMemory = Runtime.getRuntime().freeMemory();

        for (int j = 0; j < 5000000; j++) {
            myStr.append(":" + j);
        }

        long finish = new GregorianCalendar().getTimeInMillis();
        long stopMemory = Runtime.getRuntime().freeMemory();

        System.out.println("Time Take for String Buffer Append : " + (finish - begin));
        System.out.println("Memory USed String Buffer Append : " + (initiateMemory - stopMemory));
    }
}
