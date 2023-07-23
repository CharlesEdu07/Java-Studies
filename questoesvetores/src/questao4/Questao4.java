package questao4;

import java.util.Locale;
import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números voce irá digitar? > ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um número: ");
			int num = sc.nextInt();
			
			vet[i] = num;
		}
		
		System.out.println("\nNumeros pares: ");
		
		int cont = 0;
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				cont++;
				
				System.out.print(vet[i]);
				System.out.print("  ");
			}
		}
		
		System.out.println("\n\nQuantidade de pares: " + cont);
		
		sc.close();
	}

}
