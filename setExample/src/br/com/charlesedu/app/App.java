package br.com.charlesedu.app;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import br.com.charlesedu.entities.Course;
import br.com.charlesedu.entities.Instructor;
import br.com.charlesedu.entities.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Set<Course> set = new HashSet<>();
        Set<Student> students = new HashSet<>();

        System.out.print("How many courses will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();

            System.out.println("Course #" + (i + 1) + ":");

            System.out.print("Id: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Instructor: ");
            System.out.print("Id: ");
            int instructorId = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String instructorName = sc.nextLine();

            Instructor instructor = new Instructor(instructorId, instructorName);
            Course course = new Course(id, name, instructor);

            set.add(course);
        }

        System.out.println();

        for (Course course : set) {
            System.out.println("How many students for course " + course.getName() + "? ");
            int m = sc.nextInt();

            for (int i = 0; i < m; i++) {
                System.out.println("Student #" + (i + 1) + ":");
                System.out.print("Id: ");
                int id = sc.nextInt();

                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();

                course.addStudent(new Student(id, name));
                students.add(new Student(id, name));
            }
        }

        System.out.println();

        System.out.println("Total students: " + students.size());

        sc.close();
    }
}
