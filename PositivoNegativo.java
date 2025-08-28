package nivel_basico.condicionais;
//11. Peça um número e diga se é positivo ou negativo.

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner resultado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = resultado.nextInt();
        if (numero >0 ){
            System.out.println("O número é Positivo "+numero);
        }else{
            System.out.println("O número é Negativo " +numero);
        }
        resultado.close();
    }
}
