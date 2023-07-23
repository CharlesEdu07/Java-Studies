package questao6;

import java.util.Locale;
import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter em cada vetor? > ");
		int n = sc.nextInt();
		
		int[] vet1 = new int[n];
		int[] vet2 = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		
		for (int i = 0; i < vet1.length; i++) {
			vet1[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		
		for (int i = 0; i < vet2.length; i++) {
			vet2[i] = sc.nextInt();
		}
		
		int[] aux = new int[n];
		
		for (int i = 0; i < aux.length; i++) {
			aux[i] = vet1[i] + vet2[i];
		}
		
		System.out.println("Vetor resultante: ");
		
		for (int i = 0; i < aux.length; i++) {
			System.out.println(aux[i]);
		}
		
		sc.close();
	}

}
