package questao8;

import java.util.Locale;
import java.util.Scanner;

public class Questao8 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? > ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		boolean achou = false;
		int contador = 0;
		int somador = 0;
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				achou = true;
				
				contador++;
				
				somador += vet[i];
			}
		}
		
		if (achou) {
			System.out.println("Media dos pares = " + (double) somador / (double) contador);
		}
		
		else {
			System.out.println("Nenhum numero par");
		}
		
		sc.close();
	}
}
