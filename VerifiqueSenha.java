package nivel_basico.condicional;
//26.Verifique se uma senha está correta.

import java.util.Scanner;

public class VerifiqueSenha {
    public static void main(String[] args) {
        Scanner verifiqueSenha = new Scanner(System.in);
        System.out.print("Digite sua Senha: ");
        // != -> diferente de
        // == igual a

        // senhaDigitada == senha -> verifica se é igual
        // senhaDigitada != senha -> verfica se é diferente
        int senhaDigitada = verifiqueSenha.nextInt();
        int senha = 2689;
        if (senhaDigitada == senha){
            System.out.println("A senha está certa!");
        }else{
            System.out.println("Senha Inválida!");
        }
        verifiqueSenha.close();
    }
}
