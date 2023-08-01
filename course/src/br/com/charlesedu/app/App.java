package br.com.charlesedu.app;

import java.util.Locale;
import java.util.Scanner;

import br.com.charlesedu.entities.Product;

public class App {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println("\nProduct data: " + product);
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		
		product.addProducts(quantity);
		
		System.out.println("\nUpdated data: " + product);
		
		System.out.print("\nEnter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		
		product.removeProducts(quantity);
		
		System.out.println("\nUpdated data: " + product);
		
		sc.close();
	}

}
