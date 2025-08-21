package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        // Inserindo 5 números na lista
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite o %dº número: ", i);
            int num = teclado.nextInt();
            numeros.add(num);
        }

        // Encontrando o maior número
        int maior = numeros.get(0); // Assume o primeiro como maior

        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("Maior número da lista: " + maior);
        teclado.close();
    }
}

