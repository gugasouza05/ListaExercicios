package condicionais;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("1º nota:");
        float nota1 = teclado.nextFloat();

        System.out.println("2º nota:");
        float nota2 = teclado.nextFloat();

    /*Se uma das notas for negativa ou maior que 10, a média ainda pode ser entre 0 e 10,
    o que mascararia o erro. Exemplo: nota1 = -2 e nota2 = 12 → média = 5,0, que daria "Reprovado" mesmo sendo inválido.
     */
        float media = (nota1 + nota2)/2;

        if (media < 7  && media >= 0) {
            System.out.println("Reprovado");
        } else if (media >= 7 && media < 10) {
            System.out.println("Aprovado");
        } else if (media == 10) {
            System.out.println("Aprovado com distinção.");
        } else {
            System.out.println("Notas inválidas");
        }
    }
}
