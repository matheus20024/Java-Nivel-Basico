package nivel_basico.laços;
//35.Escreva a tabuada de um número digitado.

import java.util.Scanner;

public class TabuadaNumeroDigitado {
    public static void main(String[] args) {
        Scanner entradaNumero = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = entradaNumero.nextInt();
        for (int i = 1; i<=10 ; i++){
            int tabuada = numero * i;
            System.out.println(numero+" x "+i+" = "+tabuada);
        }
    }
}
