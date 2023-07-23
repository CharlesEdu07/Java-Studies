package questao9;

import java.util.Locale;
import java.util.Scanner;

public class Questao9 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");

            System.out.print("Nome: ");
            nomes[i] = sc.next();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        int max = 0;
        int pos = 0;

        for (int i = 0; i < n; i++) {
            if (idades[i] > max) {
                max = idades[i];

                pos = i;
            }
        }

        System.out.println("Pessoa mais velha: " + nomes[pos]);
		
		sc.close();
	}
}
