package condicionais;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("M-Matutino\nV-Vespertino\nN-Noturno");

        System.out.println("Em qual turno você estuda?");
        char horario = teclado.nextLine().trim().toUpperCase().charAt(0);

        switch (horario){
            case 'M':
                System.out.println("Você estuda no período matutino. Bom dia!");
                break;
            case 'V':
                System.out.println("Você estuda no período vespertino. Boa tarde!");
                break;
            case 'N':
                System.out.println("Você estuda no período noturno. Boa noite!");
                break;
            default:
                System.out.println("Você inseriu um caractere inválido");
        }
        teclado.close();
    }
}
