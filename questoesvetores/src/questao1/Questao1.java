package questao1;

import java.util.Locale;
import java.util.Scanner;

public class Questao1 {

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
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();

	}

}
