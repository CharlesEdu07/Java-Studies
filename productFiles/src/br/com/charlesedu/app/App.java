package br.com.charlesedu.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.charlesedu.entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> products = new ArrayList<>();

        String path = System.getProperty("user.dir") + "\\src\\br\\com\\charlesedu\\files\\products.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                System.out.println("Name = " + fields[0] + ", Price = " + fields[1] + ", Quantity = " + fields[2] + "");
                line = br.readLine();

                Product product = new Product(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2]));

                products.add(product);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProducts:");

        for (Product product : products) {
            System.out.println(product);
        }

        String outPath = System.getProperty("user.dir") + "\\src\\br\\com\\charlesedu\\files\\out.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outPath))) {
            for (Product product : products) {
                bw.write(product.getName() + "," + String.format("%.2f", product.total()));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
