package nivel_basico.condicionais;
//18.Peça uma nota e diga se o aluno foi aprovado (>=7).

import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner  verificarNota = new Scanner(System.in);
        System.out.print("Digite sua Aluno: ");
        int nota = verificarNota.nextInt();
        if (nota >= 7){
            System.out.println("Parabéns você passou.");
        }else{
            System.out.println("você foi reprovado.");
        }
        verificarNota.close();
    }
}
