package condicionais;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor real:");
        float vReal = teclado.nextFloat();

        if (vReal > 0){
            System.out.println("O valor digitado é positivo");
        } else if (vReal < 0){
            System.out.println(("O valor digitado é negativo"));
        } else {
            System.out.println("0 é elemento neutro");
        }
        teclado.close();
    }
}
