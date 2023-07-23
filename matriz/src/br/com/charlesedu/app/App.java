package br.com.charlesedu.app;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de linhas da matriz: ");
        int rows = sc.nextInt();

        System.out.println("Digite o numero de colunas da matriz: ");
        int columns = sc.nextInt();

        int[][] mat = new int[rows][columns];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Digite o valor da linha " + i + " e coluna " + j + ": ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite o numero que deseja encontrar na matriz: ");
        int number = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == number) {
                    System.out.println("Position " + i + "," + j + ":");

                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }

                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }

                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }

                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }   
            }
        }

        sc.close();
    }
}
