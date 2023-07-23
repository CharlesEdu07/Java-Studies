package app;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import entities.Employee;

public class App {

    public static boolean hasId(int id, List<Employee> list) {
        if (list.isEmpty()) {
            return false;
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return true;
            }
        }

        return false;
    }

    public static int findId(int id, List<Employee> list) {
        if (list.isEmpty()) {
            return -1;
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee #" + (i + 1) + ":");

            System.out.print("Id: ");
            Integer id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        if (hasId(id, list) && findId(id, list) != -1) {
            System.out.print("\nEnter the percentage: ");
            double percentage = sc.nextDouble();

            list.get(findId(id, list)).increaseSalary(percentage);

            System.out.println("List of employees: ");

            for (Employee emp : list) {
                System.out.println(emp);
            }
        }

        else {
            System.out.println("This id does not exist!");
        }

        sc.close();
    }
}
