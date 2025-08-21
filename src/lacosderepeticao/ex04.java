package lacosderepeticao;

import java.util.Scanner;

///O sistema deve solicitar uma senha ao usuário até que ele digite a senha correta (1234).
public class ex04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int senhaCorreta = 1234;
        int senha;

        do {
            System.out.println("Digite sua senha:");
            senha = teclado.nextInt();

            if (senha == senhaCorreta){
                System.out.println("Acesso permitido.");
            } else{
                System.out.println("Acesso negado. Tente novamente.");
            }

        } while (senha != senhaCorreta);

        teclado.close();
    }
}
