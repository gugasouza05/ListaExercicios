package lacosderepeticao;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador = 0;
        int num;
        int maior = Integer.MIN_VALUE; // Funciona com negativos também

        do {
            System.out.print("Informe um número: ");
            num = teclado.nextInt();

            if (num > maior) {
                maior = num;
            }

            contador++;
        } while (contador < 5);

        System.out.println("Maior número: " + maior);
    }
}
