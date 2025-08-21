package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº número: ", i);
            int num = teclado.nextInt();
            soma += num;
            numeros.add(num);
        }

        System.out.println("A soma de todos os números é: " + soma);
        teclado.close();
    }
}

