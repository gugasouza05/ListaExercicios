package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite o %dº nome: ", i);
            String nome = teclado.nextLine();
            nomes.add(nome); // Adiciona o nome na lista
        }

        System.out.println("\nNomes digitados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        teclado.close();
    }
}
