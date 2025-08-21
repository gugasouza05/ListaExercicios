package arrays;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int [] numeros = new int[6];

        for (int i = 0; i < 6 ; i++) {
            System.out.printf("Digite o %d número: ",i+1);
            numeros[i] = teclado.nextInt();
        }
        System.out.println("Números na ordem inversa:");
        for (int i = 5; i >= 0 ; i--) {
            System.out.print(numeros[i]+" ");
        }
    }
}
