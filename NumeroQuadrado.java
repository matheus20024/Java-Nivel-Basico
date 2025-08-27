package nivel_basico;

import java.util.Scanner;

public class NumeroQuadrado {
    public static void main(String[] args) {
        Scanner resultado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = resultado.nextInt();
        int quadrado = numero * numero;
        System.out.println("O quadrado do número é: "+quadrado);
        resultado.close();
    }
}
