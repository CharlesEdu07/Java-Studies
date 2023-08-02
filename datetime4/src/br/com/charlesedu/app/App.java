package br.com.charlesedu.app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        LocalDate d1 = LocalDate.parse("2020-01-01");
        LocalDateTime d2 = LocalDateTime.parse("2020-01-01T10:00:00");

        LocalDate lastWeek = d1.minusWeeks(1);
        LocalDate nextWeek = d1.plusWeeks(1);
        LocalDate nextDayDate = LocalDate.now().plusDays(1);

        System.out.println(lastWeek);
        System.out.println(nextWeek);
        System.out.println(nextDayDate);

        LocalDateTime nextDayTime = LocalDateTime.now().plusDays(1);
        LocalDateTime nextHourTime = LocalDateTime.now().plusHours(1);
        LocalDateTime nextMinuteTime = LocalDateTime.now().plusMinutes(1);

        System.out.println(nextDayTime);
        System.out.println(nextHourTime);
        System.out.println(nextMinuteTime);

        Instant pastWeekInstant = Instant.now().minus(7, ChronoUnit.DAYS);
        Instant pastDayInstant = Instant.now().minus(1, ChronoUnit.DAYS);

        System.out.println(pastWeekInstant);
        System.out.println(pastDayInstant);

        Duration t1 = Duration.between(LocalDateTime.now(), nextDayTime);
        Duration t2 = Duration.between(d1.atStartOfDay(), d2);

        System.out.println(t1.toDays());
        System.out.println(t2.toDays());

        sc.close();
    }
}
