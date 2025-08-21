package condicionais;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("1º reta:");
        int reta1 = teclado.nextInt();

        System.out.println("2º reta:");
        int reta2 = teclado.nextInt();

        System.out.println("3º reta:");
        int reta3 = teclado.nextInt();

        if (reta1 <= 0 || reta2 <= 0 || reta3 <= 0) {
            System.out.println("As medidas das retas devem ser maiores que zero.");
        } else if(reta1 + reta2 < reta3 || reta1 + reta3 < reta2 || reta2 + reta3 < reta1 ){
            System.out.println("As três retas não podem formar um triângulo");
        } else if (reta1 == reta2 && reta2 == reta3) {
            System.out.println("As três retas formam um triângulo equilátero.");
        } else  if (reta1 == reta2 || reta1 == reta3 || reta2 == reta3 ){
            System.out.println("As três retas formam um triângulo isóceles");
        } else {
            System.out.println("As três retas formam um triângulo escaleno");
        }
        teclado.close();
    }
}
