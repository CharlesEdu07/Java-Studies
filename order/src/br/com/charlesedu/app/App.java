package br.com.charlesedu.app;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.charlesedu.entities.Client;
import br.com.charlesedu.entities.Order;
import br.com.charlesedu.entities.OrderItem;
import br.com.charlesedu.entities.Product;
import br.com.charlesedu.entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();

        System.out.print("Email: ");
        String clientEmail = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String clientBirthDate = sc.nextLine();

        Client client = new Client(clientName, clientEmail, sdf1.parse(clientBirthDate));

        System.out.println();

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String orderStatus = sc.nextLine();

        OrderStatus status = OrderStatus.valueOf(orderStatus);

        System.out.print("How many items to this order? ");
        int orderItems = sc.nextInt();

        Product product;
        OrderItem orderItem;

        Order order = new Order(new Date(), status, client);
        
        for (int i = 1; i <= orderItems; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            orderItem = new OrderItem(productQuantity, productPrice, product);

            order.addItem(orderItem);
        }

        System.out.println(order);
        
        sc.close();
    }
}
