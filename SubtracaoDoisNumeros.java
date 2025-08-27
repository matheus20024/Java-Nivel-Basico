package nivel_basico;
// 4. Peça dois números e mostre a subtração

import java.util.Scanner;

public class SubtracaoDoisNumeros {
    public static void main(String[] args) {
        Scanner calculo = new Scanner(System.in);
        System.out.print("Digite primeiro número: ");
        int numero1 = calculo.nextInt();
        System.out.print("Digite segundo número: ");
        int numero2 = calculo.nextInt();
        int subtracao = numero1 - numero2;
        System.out.println("A subtração: "+subtracao);
        calculo.close();
    }
}
