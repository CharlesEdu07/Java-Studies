package br.com.charlesedu.app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        LocalDate d1 = LocalDate.parse("2020-01-01");
        LocalDateTime d2 = LocalDateTime.parse("2020-01-01T10:00:00");
        Instant d3 = Instant.parse("2020-01-01T10:00:00Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

        System.out.println("Data 1: " + d1.format(fmt1));
        System.out.println("Data 2: " + d2.format(fmt2));
        System.out.println("Data 3: " + fmt3.format(d3));
    }
}
