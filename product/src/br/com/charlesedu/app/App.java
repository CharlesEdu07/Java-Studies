package br.com.charlesedu.app;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.charlesedu.entities.ImportedProduct;
import br.com.charlesedu.entities.Product;
import br.com.charlesedu.entities.UsedProduct;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> products = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureDate = sc.next();

                products.add(new UsedProduct(name, price, sdf.parse(manufactureDate)));
            } else if (type == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();

                products.add(new ImportedProduct(name, price, customsFee));
            } else {
                products.add(new Product(name, price));
            }
        }

        System.out.println();

        System.out.println("PRICE TAGS:");
        
        for (Product product : products) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
