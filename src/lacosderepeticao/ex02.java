package lacosderepeticao;

import java.util.Scanner;

//Peça ao usuário um número inteiro positivo N e calcule a soma de todos os números de 1 até N.
public class ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número inteiro positivo:");
        int n = teclado.nextInt();
        int soma = 0;

        if (n < 1){
            System.out.println("Erro: o número deve ser maior que 0");
        } else {
            for (int i = 1; i <= n; i++) {
                soma += i;
                if (i<n) {
                    System.out.print(i + " + ");
                } else {
                    System.out.print(i + " = ");
                }
            }
            System.out.println(soma);
        }
        teclado.close();
    }
}
