package nivel_basico;
// 5. Peça dois números e mostre a multiplicação.

import java.util.Scanner;

public class MultiplicacaoDoisNumero {
    public static void main(String[] args) {
        Scanner calculo = new Scanner(System.in);
        System.out.print("Digite primeiro número: ");
        int numero1 = calculo.nextInt();
        System.out.print("Digite segundo número: ");
        int numero2 = calculo.nextInt();
        int multiplicar = numero1 * numero2;
        System.out.println("A multiplicação: "+multiplicar);
        calculo.close();
    }
}
