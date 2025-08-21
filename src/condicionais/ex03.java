package condicionais;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual seu sexo?(F ou M)");
        char sexo = teclado.nextLine().trim().toUpperCase().charAt(0);

        switch (sexo){
            case 'F':
                System.out.println("F-Feminino");
                break;
            case 'M':
                System.out.println("M-Masculino");
                break;
            default:
                System.out.println("Somente F ou M são válidos.");
                break;
        }
        teclado.close();
    }
}
