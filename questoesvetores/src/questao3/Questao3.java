package questao3;

import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class Questao3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão cadastradas? > ");
		int n = sc.nextInt();
		
		Pessoa[] vetPessoa = new Pessoa[n];
		
		for (int i = 0; i < vetPessoa.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa");
			
			System.out.print("Digite o nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Digite a idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Digite a altura: ");
			double altura = sc.nextDouble();
			
			vetPessoa[i] = new Pessoa(nome, idade, altura);
		}
		
		double somaAltura = 0;
		int contIdade = 0;
		
		for (int i = 0; i < vetPessoa.length; i++) {
			somaAltura += vetPessoa[i].getAltura();
			
			if (vetPessoa[i].getIdade() < 16) {
				contIdade++;
			}
		}
		
		double percent = ((double) contIdade / (double) vetPessoa.length) * 100;
		
		System.out.println("\nAltura média: " + somaAltura / vetPessoa.length);
		System.out.println("Pessoas com menos de 16 anos: " + percent + "%");
		
		for (int i = 0; i < vetPessoa.length; i++) {
			if (vetPessoa[i].getIdade() < 16) {
				System.out.println(vetPessoa[i].getNome());
			}
		}
		
		sc.close();
	}

}
