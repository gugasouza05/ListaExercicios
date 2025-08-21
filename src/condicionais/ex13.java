package condicionais;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("1º número:");
        int n1 = teclado.nextInt();

        System.out.println("2º numero:");
        int n2 = teclado.nextInt();

        System.out.println("------MENU------");
        System.out.println("1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão");
        int opcao = teclado.nextInt();

        switch (opcao){
            case 1:
                int resultado = n1 + n2;
                if (resultado < 0){
                    System.out.println("Resultado : "+resultado+", o número é positivo");
                } 
            case 2:
            case 3:
            case 4:

        }
    }
}
