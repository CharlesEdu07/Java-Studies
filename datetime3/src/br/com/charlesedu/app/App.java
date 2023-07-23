package br.com.charlesedu.app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        LocalDate d1 = LocalDate.parse("2020-01-01");
        Instant d3 = Instant.parse("2022-07-01T01:30:00Z");

        LocalDate r1 = LocalDate.ofInstant(d3, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d3, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d3, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d3, ZoneId.of("Portugal"));

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        System.out.println("Dia: " + d1.getDayOfMonth());
        System.out.println("Mês: " + d1.getMonthValue());
        System.out.println("Ano: " + d1.getYear());
    }
}
