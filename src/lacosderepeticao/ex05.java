package lacosderepeticao;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float nota;

        do {
            System.out.println("Informe sua nota entre 0 e 10: ");
            nota = teclado.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido! Tente novamente.");
            }

        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida: "+nota);

        teclado.close();
    }
}
