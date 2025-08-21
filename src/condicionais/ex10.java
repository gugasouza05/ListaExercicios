package condicionais;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Nota 1º:");
        float n1 = teclado.nextFloat();

        System.out.println("Nota 2º:");
        float n2 = teclado.nextFloat();

        if (n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10 ) {
            System.out.println("Notas inválidas");
        } else {
            float media = (n1+n2)/2;
            if (media >= 9 && media <=10) {
                System.out.println("Parebéns, nota A");
            } else if (media >= 7.5 && media < 9) {
                System.out.println("Nota B");
            } else if (media >= 6 && media < 7.5) {
                System.out.println("Nota C");
            } else if (media >= 4 && media < 6) {
                System.out.println("Nota D");
            } else if (media >= 0 && media < 4) {
                System.out.println("Melhore, nota E");
            }
        }
        teclado.close();
    }
}