package br.com.charlesedu.app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
        Instant d3 = Instant.now();

        LocalDate d4 = LocalDate.parse("2022-07-20");
        LocalDateTime d5 = LocalDateTime.parse("2022-07-20T15:42:07");
        Instant d6 = Instant.parse("2022-07-20T15:42:07Z");
        Instant d7 = Instant.parse("2022-07-20T15:42:07-03:00");

        LocalDate d8 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d9 = LocalDateTime.parse("20/07/2022 15:42:07", fmt2);

        LocalDate d10 = LocalDate.of(2022, 7, 20);  
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 15, 42, 7);

        System.out.println("Data 01: " + d1);
        System.out.println("Data 02: " + d2);
        System.out.println("Data 03: " + d3);
        System.out.println("Data 04: " + d4);
        System.out.println("Data 05: " + d5);
        System.out.println("Data 06: " + d6);
        System.out.println("Data 07: " + d7);
        System.out.println("Data 08: " + d8);
        System.out.println("Data 09: " + d9);
        System.out.println("Data 10: " + d10);
        System.out.println("Data 11: " + d11);
    }
}
