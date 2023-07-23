package questao10;

import java.util.Locale;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        double[] notas1 = new double[n];
        double[] notas2 = new double[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();

            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "° aluno:");

            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Nota 1: ");
            notas1[i] = sc.nextDouble();

            System.out.print("Nota 2: ");
            notas2[i] = sc.nextDouble();
        }

        double[] medias = new double[n];

        for (int i = 0; i < n; i++) {
            medias[i] = (notas1[i] + notas2[i]) / 2;
        }

        for (int i = 0; i < n; i++) {
            if (medias[i] >= 6.0) {
                System.out.println("Aluno " + nomes[i] + " aprovado com média " + medias[i]);
            }
        }

        sc.close();
    }
}
