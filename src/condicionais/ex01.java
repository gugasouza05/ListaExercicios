package condicionais;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor inteiro para A:");
        int nA= teclado.nextInt();

        System.out.println("Digite um valor inteiro para B:");
        int nB = teclado.nextInt();

        System.out.println(Math.max(nA, nB));

        teclado.close();
    }
}

