package DateAndTimeApi;

import java.time.LocalDate;

public class DateExample {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate); // yyyy/mm/dd

        System.out.println(LocalDate.of(2018, 01, 01));
        System.out.println(LocalDate.parse("2018-01-01"));
    }
}
