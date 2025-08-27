package nivel_basico;
// 2. Peça o nome do usuário e cumprimente.

import java.util.Scanner;

public class UsaurioSaudacao {
    public static void main(String[] args) {
        Scanner saudacao = new Scanner(System.in);;
        System.out.print("Digite seu nome: ");
        String nome = saudacao.nextLine();
        System.out.println("Bem-Vindo: "+nome);
        saudacao.close();
    }
}
