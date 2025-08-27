package nivel_basico;
//6. Peça dois números e mostre a divisão

import java.util.Scanner;

public class DivisaoDoisNumeros {
    public static void main(String[] args) {
        Scanner calculo = new Scanner(System.in);
        System.out.print("Digite primeiro número: ");
        int numero1 = calculo.nextInt();
        System.out.print("Digite segundo número: ");
        int numero2 = calculo.nextInt();
        int divisao = numero1 / numero2;
        System.out.println("A Divisão: "+divisao);
        calculo.close();
    }
}
