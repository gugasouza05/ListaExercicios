package arrays;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];

        int vzs = 0;

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº número: ",i+1);
            numeros[i] = teclado.nextInt();
        }
        System.out.print("Digite um número de busca: ");
        int busca = teclado.nextInt();

        System.out.print("\nLista de números: [ ");
        for (int i = 0; i < 5; i++) {
            if (busca == numeros[i]){
                vzs++;
            }
            System.out.print(numeros[i]+" ");
        }
        System.out.print("]");
        System.out.printf("\nO número %d aparece %d vez(es) na lista.", busca, vzs);
        teclado.close();
    }
}
