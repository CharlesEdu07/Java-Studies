package br.com.charlesedu.app;

import java.util.Locale;
import java.util.Scanner;

import br.com.charlesedu.entities.Employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.printf("%nEmployee: %s, %.2f%n", emp.name, emp.netSalary());
		
		System.out.print("\nWhich percentage to increase salary? ");
		emp.increaseSalary(sc.nextDouble());
		
		System.out.printf("%nUpdated data: %s, %.2f", emp.name, emp.netSalary());
		
		sc.close();
	}

}
