package condicionais;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Preço do primeiro produto:");
        float prod1 = teclado.nextFloat();

        System.out.println("Preço do segundo produto:");
        float prod2 = teclado.nextFloat();

        System.out.println("Preço do terceiro produto:");
        float prod3 = teclado.nextFloat();

        float menorPreco = prod1;

        if (prod2 < menorPreco){
            menorPreco = prod2;
        } if (prod3 < menorPreco){
            menorPreco = prod3;
        }
        System.out.printf("O menor preço é R$%.2f", menorPreco);
    }
}
