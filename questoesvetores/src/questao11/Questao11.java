package questao11;

import java.util.Locale;
import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        Float[] height = new Float[n];
        char[] gender = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + "° pessoa: ");
            height[i] = sc.nextFloat();

            System.out.print("Genero da " + (i + 1) + "° pessoa: ");
            gender[i] = sc.next().charAt(0);
        }

        float max_height = 0;

        for (int i = 0; i < n; i++) {
            if (height[i] > max_height) {
                max_height = height[i];
            }
        }

        float min_height = max_height;

        for (int i = 0; i < n; i++) {
            if (height[i] < min_height) {
                min_height = height[i];
            }
        }

        float accumulator = 0;
        int woman_count = 0;
        int man_count = 0;

        for (int i = 0; i < n; i++) { 
            if (gender[i] == 'F') {
                accumulator += height[i];

                woman_count++;
            }

            else {
                man_count++;
            }
        }

        float woman_height_media = accumulator / woman_count;

        System.out.println("Maior altura: " + max_height);
        System.out.println("Menor altura: " + min_height);
        System.out.println("Media das alturas das mulheres = " + woman_height_media);
        System.out.println("Numero de homens = " + man_count);

        sc.close();
    }
}
