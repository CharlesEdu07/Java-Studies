package br.com.charlesedu.app;

import java.util.Locale;
import java.util.Scanner;

import br.com.charlesedu.entities.Account;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double value = 0;
		
		Account account;
		
		System.out.print("Enter account number: ");
		String accountNumber = sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char op = sc.next().charAt(0);
		
		if (op == 'y') {
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble();
			
			account = new Account(accountNumber, holder, value);
		}
		
		else {
			account = new Account(accountNumber, holder);
		}
		
		System.out.println("\nAccount data: ");
		System.out.println(account);
		
		System.out.print("\nEnter a deposit value: ");
		value = sc.nextDouble();
		
		account.deposit(value);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.print("\nEnter a withdraw value: ");
		value = sc.nextDouble();
		
		account.withdraw(value);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}

}
