package lacosderepeticao;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = teclado.nextInt();

        if (numero < 0 || numero > 10){
            System.out.println("Erro: número deve ser entre 0 e 10.");
        } else {
            System.out.println("\nTabuada do "+ numero+":");
            for (int i = 0; i < 11; i++) {
                System.out.printf("%d x %d = %d%n", numero, i, numero * i);
            }
        }
    }
}
