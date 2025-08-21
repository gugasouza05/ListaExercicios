package condicionais;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Valor de A:");
        int n1 = teclado.nextInt();

        System.out.println("Valor de B:");
        int n2 = teclado.nextInt();

        System.out.println("Valor de C:");
        int n3 = teclado.nextInt();

        int maiorNumero = 0;
        /*Seu código está quase certo, mas tem uma pequena limitação:
        ele não trata corretamente quando dois ou mais valores são iguais e maiores, por exemplo:
        Se n1 = 10, n2 = 10 e n3 = 5, o programa vai imprimir n3, o que está errado.*/

        if (n1 > n2 && n1 > n3 ){
            maiorNumero = n1;
        } else if (n2 > n1 && n2 > n3) {
            maiorNumero = n2;
        } else {
            maiorNumero = n3;
        }
        System.out.println(maiorNumero);
    }
}
