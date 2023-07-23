package questao5;

import java.util.Locale;
import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números voce irá digitar? > ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um número: ");
			double num = sc.nextDouble();
			
			vet[i] = num;
		}
		
		double maiorValor = 0.0;
		int pos = 0;
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > maiorValor) {
				maiorValor = vet[i];
				
				pos = i;
			}
		}
		
		System.out.println("\nMaior valor = " + maiorValor);
		System.out.println("Posição do maior valor = " + pos);
		
		sc.close();
	}

}
