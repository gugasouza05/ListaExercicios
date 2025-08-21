package condicionais;

import java.util.Scanner;

public class ex05corrigido{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Valor de A:");
        int n1 = teclado.nextInt();

        System.out.println("Valor de B:");
        int n2 = teclado.nextInt();

        System.out.println("Valor de C:");
        int n3 = teclado.nextInt();

        int maiorNumero = n1;

        if (n2 > maiorNumero ){
            maiorNumero = n2;
        } if (n3 > maiorNumero) {
            maiorNumero = n3;
        }
        System.out.println(maiorNumero);
    }
}
