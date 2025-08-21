package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Float> notas = new ArrayList<>();

        float media = 0, soma = 0;

        for (int i = 1; i <= 5 ; i++) {

            System.out.printf("Digite a %dº nota: ",i);
            float nota = teclado.nextFloat();
            notas.add(nota);
            soma += nota;
            media = soma /5;
        }
        System.out.println(notas);
        System.out.println("Média das notas: "+media);
    }
}
