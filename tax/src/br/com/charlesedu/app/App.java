package br.com.charlesedu.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.charlesedu.entities.FisicalPerson;
import br.com.charlesedu.entities.LegalPerson;
import br.com.charlesedu.entities.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<Person> persons = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                persons.add(new FisicalPerson(name, annualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                persons.add(new LegalPerson(name, annualIncome, numberOfEmployees));
            }
        }

        System.out.println();

        System.out.println("TAXES PAID:");

        double totalTaxes = 0.0;

        for (Person person : persons) {
            System.out.println(person.getName() + ": $ " + String.format("%.2f", person.tax()));
            totalTaxes += person.tax();
        }

        System.out.println();

        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));

        sc.close();
    }
}
