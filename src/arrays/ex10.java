package arrays;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] letras = new char[5];

        // Leitura das 5 letras
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite a %dª letra: ", i + 1);
            letras[i] = scanner.next().toUpperCase().charAt(0);
        }

        // Verificação do palíndromo
        boolean ehPalindromo = true;
        for (int i = 0; i < 5 / 2; i++) {
            if (letras[i] != letras[4 - i]) {
                ehPalindromo = false;
                break;
            }
        }

        // Resultado
        System.out.print("\nSequência digitada: ");
        for (char c : letras) {
            System.out.print(c + " ");
        }

        if (ehPalindromo) {
            System.out.println("\nÉ um palíndromo!");
        } else {
            System.out.println("\nNão é um palíndromo.");
        }

        scanner.close();

    }
}
