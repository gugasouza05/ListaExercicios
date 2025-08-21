package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 8; i++) {
            System.out.printf("Digite o %dº número: ", i);
            int num = teclado.nextInt();
            numeros.add(num);
        }

        int maior = numeros.get(0);
        int menor = numeros.get(0);

        for (int i = 1; i < numeros.size(); i++) {
            int atual = numeros.get(i);
            if (atual > maior) {
                maior = atual;
            }
            if (atual < menor) {
                menor = atual;
            }
        }

        System.out.println("\nMaior número: " + maior);
        System.out.println("Menor número: " + menor);

        teclado.close();
    }
}
