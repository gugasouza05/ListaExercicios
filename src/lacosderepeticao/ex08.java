package lacosderepeticao;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float somador = 0, totalMedias = 5;

        for (int i = 1; i < 6; i++) {
            System.out.printf("Digite o %dº número: ", i);
            float num = teclado.nextFloat();
            somador += num;

        }
        float media = somador/totalMedias;

        System.out.printf("Soma = %.2f\nMedia = %.2f", somador, media);

        teclado.close();
    }
}