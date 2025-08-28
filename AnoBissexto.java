package nivel_basico.condicionais;
//15.Verifique se um ano é bissexto

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner verificarAno = new Scanner(System.in);
        System.out.print("Digite um Ano: ");
        double ano = verificarAno.nextDouble();
        // ano % 4 == 0 -> verifica se ano é mútiplo de 4.
        // se não for mútiplo de 4, não é bissexto.

        // ano % 100 != 0 -> garante que ano não seja múltiplo de 100.
        // porque séculos (ex: 1700, 1800, 1900) não são bissextos.

        // ano % 400 == 0 -> exceção para múltiplos de 400.
        // ex: 1600, 2000, 2400 são bissextos, mesmo sendo divisíveis por 100.

        // O II (OU) junta as duas condições:
        // Ou o ano é divisível por 4 e não por 100
        // Ou é divisível por 400

        if ((ano % 4==0 && ano % 100 != 0) || ( ano % 400==0 )){
            System.out.println("O ano "+ano+" é ano bissexo.");
        }else{
            System.out.println("o ano "+ano+" não é ano bissexto.");
        }
        verificarAno.close();
    }
}
