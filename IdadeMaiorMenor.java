package nivel_basico.condicionais;
//14.Peça a idade e diga se é maior de idade.

import java.util.Scanner;

public class IdadeMaiorMenor {
    public static void main(String[] args) {
        Scanner maiorMenor = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = maiorMenor.nextInt();
        if (idade>=18){
            System.out.println("Você é maior de Idade.");
        }else{
            System.out.println("Você é menor de Idade.");
        }
        maiorMenor.close();
    }
}
