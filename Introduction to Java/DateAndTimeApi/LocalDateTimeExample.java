package DateAndTimeApi;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExample {
    public static void main(String[] args) {

        // Get local date and time today
        System.out.println(LocalDateTime.now());

        System.out.println(LocalDateTime.of(2022, Month.DECEMBER, 10, 03, 30));

        System.out.println(LocalDateTime.parse("2018-01-20T06:24:00"));

        // minusTime
        LocalDateTime subHours = LocalDateTime.now().minusHours(3);
        System.out.println(subHours);

        // plusTime
        LocalDateTime addHours = LocalDateTime.now().plusHours(3);
        System.out.println(addHours);

        // Get specific Month
        System.out.println(LocalDateTime.now().getMonth());

    }
}
