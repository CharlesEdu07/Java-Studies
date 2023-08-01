package br.com.charlesedu.app;

import java.util.Locale;
import java.util.Scanner;

import br.com.charlesedu.entities.Client;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		Client[] clients = new Client[10];

		for (int i = 0; i < n; i++) {
			System.out.printf("%nRent #%d%n", i + 1);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.nextLine();

			System.out.print("Room: ");
			int room = sc.nextInt();

			clients[room] = new Client(room, name, email);
		}

		System.out.println("\nBusy rooms: ");

		for (int i = 0; i < clients.length; i++) {
			if (clients[i] != null) {
				System.out.println(clients[i].getRoom() + ": " + clients[i].getName() + ", " + clients[i].getEmail());
			}
		}

		sc.close();
	}
}
