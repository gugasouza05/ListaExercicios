package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        int quantPares = 0, quantImpares = 0;

        for (int i = 1; i <=10 ; i++) {
            System.out.printf("Digite o %dº número: ", i);
            int num = teclado.nextInt();
            numeros.add(num);
            if (num % 2 == 0) {
                quantPares++;
            } else {
                quantImpares++;
            }
        }
        System.out.println(numeros);
        System.out.println("Quantidade de pares: "+quantPares);
        System.out.println("Quantidade de ímpares: "+quantImpares);
    }
}
