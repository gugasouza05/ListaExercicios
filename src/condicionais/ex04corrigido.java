package condicionais;

import java.util.Scanner;

public class ex04corrigido {
        public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("1º nota:");
        float nota1 = teclado.nextFloat();

        System.out.println("2º nota:");
        float nota2 = teclado.nextFloat();

        if ( nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 ){
            System.out.println("Notas inválidas");
        } else {
            float media = (nota1 + nota2) / 2;

            if (media == 10) {
                System.out.println("Aprovado com distinção");
            } else if (media >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}

