package DateAndTimeApi;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneDateApiExample {
    public static void main(String[] args) {

        ZoneId id = ZoneId.of("Asia/Seoul");
        System.out.println(id);

        // Get all times zones
        Set<String> allIds = ZoneId.getAvailableZoneIds();
        // System.out.println(allIds);

        // Choose specific time zone
        ZonedDateTime indonesia = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Kuala_Lumpur"));
        System.out.println(indonesia);

        // create a localDateTime
        LocalDateTime ltd = LocalDateTime.of(2018, Month.MARCH, 10, 07, 20);
        System.out.println(ltd);

        // add four hours and create ZoneOffset
        LocalDateTime localDateTime = LocalDateTime.of(2022, Month.DECEMBER, 13, 22, 20);
        ZoneOffset os = ZoneOffset.of("+04:00");
        OffsetDateTime obsetDateTime = OffsetDateTime.of(localDateTime, os);
        System.out.println(obsetDateTime);

    }
}
