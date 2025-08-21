package condicionais;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Salário do colaborador:");
        float salColaborador = teclado.nextFloat();

        if (salColaborador <= 0) {
            System.out.println("Salário inválido. Deve ser maior que zero.");
            teclado.close();
            return;
        }

        float percentual = 0;
        float salAjustado = salColaborador;

        if (salColaborador <= 280) {
            percentual = 20;
            salAjustado = salColaborador * 1.2f;
        } else if (salColaborador < 700) {
            percentual = 15;
            salAjustado = salColaborador * 1.15f;
        } else if (salColaborador < 1500) {
            percentual = 10;
            salAjustado = salColaborador * 1.1f;
        } else {
            percentual = 5;
            salAjustado = salColaborador * 1.05f;
        }

        // Usa Math para calcular o aumento com mais segurança (poderia usar Math.abs, mas aqui é só uma subtração)
        float aumento = Math.abs(salAjustado - salColaborador); // em teoria nunca será negativo, mas é uma boa prática

        // Impressão formatada
        System.out.printf("Salário antes do reajuste: R$%.2f\n", salColaborador);
        System.out.printf("Percentual de aumento aplicado: %.0f%%\n", percentual);
        System.out.printf("Valor do aumento: R$%.2f\n", aumento);
        System.out.printf("Salário ajustado: R$%.2f\n", salAjustado);

        teclado.close();
    }
}
