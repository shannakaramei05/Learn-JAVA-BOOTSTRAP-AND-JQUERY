package DateAndTimeApi;

import java.time.LocalTime;

public class TimeExample {
    public static void main(String[] args) {

        // get time today
        LocalTime whatIsTheTime = LocalTime.now();
        System.out.println(whatIsTheTime);

        // parsing time
        LocalTime parsingTime = LocalTime.parse("03:20");
        System.out.println(parsingTime);

        // also parsing time
        LocalTime usingOf = LocalTime.of(3, 20);
        System.out.println(usingOf);

        // Get hour
        int whichHour = LocalTime.now().getHour();
        System.out.println(whichHour);

        int hour = LocalTime.parse("03:20").getHour();
        System.out.println(hour);

        // Compare Time
        boolean comparingTime = LocalTime.parse("03:20").isBefore(LocalTime.parse("02:30"));
        System.out.println(comparingTime);

        // MaximumTime
        LocalTime maximumTime = LocalTime.MAX;
        System.out.println(maximumTime);

    }
}
