package condicionais;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Valor da sua hora:");
        float valorHora = teclado.nextFloat();

        System.out.println("Horas trabalhadas:");
        int horasTrabalhoMes = teclado.nextInt();

        float salarioBruto = valorHora * horasTrabalhoMes;

        float descontoIr = 0;
        float percIr = 0;
        if (salarioBruto <= 900){
            descontoIr = 0;
            percIr = 0;
        } else if (salarioBruto <= 1500){
            percIr = 5;
            descontoIr = salarioBruto * 0.05f;
        } else if (salarioBruto <= 2500) {
            percIr = 10;
            descontoIr = salarioBruto * 0.10f;
        } else{
            percIr = 20;
            descontoIr = salarioBruto * 0.20f;
        }

        float percSindicato = 10;
        float descontoSindicato = salarioBruto * 0.10f;

        float salLiquido = salarioBruto - descontoSindicato - descontoIr;
        float totalDescontos = descontoIr + descontoSindicato;

        float percFgts = 11;
        float fgts = salarioBruto * 0.11f;

        System.out.println("\n -------FOLHA DE PAGAMENTO-------");
        System.out.printf("Salário bruto(R$%.2f * %d): R$%.2f\n",valorHora, horasTrabalhoMes, salarioBruto);
        System.out.printf("(-)IR(%.0f%%):                   R$%.2f\n", percIr, descontoIr);
        System.out.printf("(-)Sindicato(%.0f%%):           R$%.2f\n", percSindicato, descontoSindicato);
        System.out.printf("FGTS(%.0f%%):                   R$%.2f\n",percFgts, fgts);
        System.out.printf("Total descontos:             R$%.2f\n",totalDescontos);
        System.out.printf("Salário liquido:             R$%.2f\n", salLiquido);

        teclado.close();
    }
}
