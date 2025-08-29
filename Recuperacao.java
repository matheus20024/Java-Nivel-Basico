package nivel_basico.condicional;
//25.Peça 2 notas e diga se precisa de recuperação.

import java.util.Scanner;

public class Recuperacao {
    public static void main(String[] args) {
        Scanner entradaNota = new Scanner(System.in);
        System.out.print("Digite a nota de Matemática: ");
        double nota1 = entradaNota.nextDouble();
        System.out.print("Digite a nota de Português: ");
        double nota2 = entradaNota.nextDouble();
        double media = (nota1 + nota2) /2;
        if (media >= 7 && media <= 10){
            System.out.println("Sua média: "+media+" -> Aprovado!");
        }
        else if (media >= 5  ){
            System.out.println("Sua média: "+media+" -> Recuperação!");
        }
        else if (media < 5){
            System.out.println("Sua média: "+media+" -> Reprovado!");
        }else{
            System.out.println("Notas inválidas!");
        }
        entradaNota.close();
    }
}
