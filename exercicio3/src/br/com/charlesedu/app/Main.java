package br.com.charlesedu.app;

import java.util.Locale;
import java.util.Scanner;

import br.com.charlesedu.entities.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.firstGrade = sc.nextDouble();
		student.secondGrade = sc.nextDouble();
		student.thirdGrade = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
		
		if (student.missingPoints() == 0.0) {
			System.out.println("PASS");
		}
		
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missingPoints());
		}
		
		sc.close();
	}

}
