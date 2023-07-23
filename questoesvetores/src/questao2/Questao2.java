package questao2;

import java.util.Locale;
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números serão digitados? > ");
		int n = sc.nextInt();
		
		while (n > 10) {
			System.out.print("Entrada inválida. Digite novamente: ");
			n = sc.nextInt();
		}
		
		int[] vet = new int[n];
		
		int sum = 0;
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < vet.length; i++) {
			sum += vet[i];
			
			System.out.print(vet[i] + " ");
		}
		
		System.out.println("\nSOMA = " + sum);
		System.out.println("MEDIA = " + sum / vet.length);
		
		sc.close();

	}

}
