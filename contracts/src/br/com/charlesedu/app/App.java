package br.com.charlesedu.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import br.com.charlesedu.models.entities.Contract;
import br.com.charlesedu.models.services.ContractService;
import br.com.charlesedu.models.services.PaypalService;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Número: ");
        int number = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), formatter);

        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Entre com o número de parcelas: ");
        int months = sc.nextInt();

        System.out.println("Parcelas: ");

        ContractService contractService = new ContractService(contract, months, new PaypalService());

        contractService.processContract();

        for (int i = 0; i < contract.getInstallments().size(); i++) {
            System.out.println(contract.getInstallments().get(i).getDueDate().format(formatter) + " - "
                    + contract.getInstallments().get(i).getAmount());
        }

        sc.close();
    }
}
