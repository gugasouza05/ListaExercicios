package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> multiplicados = new ArrayList<>();

        System.out.println("Digite um multiplicador: ");
        int multiplicador = teclado.nextInt();


        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite o %dº número: ", i);
            int num = teclado.nextInt();
            numeros.add(num);
            multiplicados.add(num * multiplicador);
        }
        System.out.println(numeros);
        System.out.println(multiplicados);
        teclado.close();
    }
}