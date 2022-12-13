package DateAndTimeApi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.tools.DocumentationTool.Location;

public class DateOperationExample {
    public static void main(String[] args) {

        // Date of tomorrow
        LocalDate taskDate = LocalDate.now().plusDays(1);
        System.out.println(taskDate);

        // Last Month
        LocalDate lastMonth = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println(lastMonth);

        // Get day Today (Tuesday)
        DayOfWeek whichDay = LocalDate.parse("2022-12-13").getDayOfWeek();
        System.out.println(whichDay);

        // Get days (int)
        int thisMonth = LocalDate.parse("2022-12-13").getDayOfMonth();
        System.out.println(thisMonth);

        // Check leap Year
        boolean isLeapYear = LocalDate.now().isLeapYear();
        System.out.println(isLeapYear);

        // comparing two dates
        boolean beforeOrNot = LocalDate.parse("2022-12-13").isBefore(LocalDate.parse("2022-12-12"));
        System.out.println(beforeOrNot); // false

        boolean afterOrNot = LocalDate.parse("2022-12-13").isAfter(LocalDate.parse("2022-12-12"));
        System.out.println(afterOrNot); // true

    }
}
