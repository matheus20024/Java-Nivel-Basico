package nivel_basico.condicional;
//23.Peça um número de 1 a 7 e diga o dia da semana.

import java.util.Scanner;

public class DiaDaSemna {
    public static void main(String[] args) {
        Scanner entradaDia = new Scanner(System.in);
        System.out.println("Escolha Dia da Semana: ");
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda-feira");
        System.out.println("3 - Terça-feira");
        System.out.println("4 - Quarta-feira");
        System.out.println("5 - Quinta-feira");
        System.out.println("6 - Sextaa-feira");
        System.out.println("7 - Sábado");
        System.out.println("Dia da Semana 1-7");
        int dia = entradaDia.nextInt();
        if (dia == 1){
            System.out.println("Dia Domingo");
        }
        if (dia == 2){
            System.out.println("Dia Segunda-feira");
        }
        if (dia == 3){
            System.out.println("Dia Terça-feira");
        }
        if (dia == 4){
            System.out.println("Dia Quarta-feira");
        }
        if (dia == 5){
            System.out.println("Dia Quinta-feira");
        }
        if (dia == 6){
            System.out.println("Dia Sexta-feira");
        }
        if (dia == 7){
            System.out.println("Dia Sábado");
        }
        entradaDia.close();
    }
}
