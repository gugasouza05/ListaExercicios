package lacosderepeticao;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int somaPar = 0;
        int somaImpar = 0;

        for (int i = 1; i < 11; i++) {
            System.out.printf("Informe o %dº número: ",i);
            int num = teclado.nextInt();

            if (num % 2 == 0) {
                somaPar++;
            } else {
                somaImpar++;
            }
        }
        System.out.println("Quantidade de pares informados: "+somaPar);
        System.out.println("Quantidade de ímpares informados: "+somaImpar);

        teclado.close();
    }
}
