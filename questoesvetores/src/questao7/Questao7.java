package questao7;

import java.util.Locale;
import java.util.Scanner;

public class Questao7 {

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
		
		double somador = 0;
		
		for (int i = 0; i < vet.length; i++) {
			somador += vet[i];
		}
		
		double media = somador / (double) vet.length;
		
		System.out.println("Media do vetor: " + media);
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < media) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();

	}

}
