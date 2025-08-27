package nivel_basico;
//3. Peça dois números e mostre a soma.

import java.util.Scanner;

public class SomaDoisNumero {
    public static void main(String[] args) {
        Scanner calculo = new Scanner(System.in);
        System.out.print("Digite primeiro número: ");
        int numero1 = calculo.nextInt();
        System.out.print("Digite segundo número: ");
        int numero2 = calculo.nextInt();
        int somar = numero1 + numero2;
        System.out.println("A soma: "+somar);
        calculo.close();
    }
}
