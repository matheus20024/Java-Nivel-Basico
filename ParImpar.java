package nivel_basico.condicionais;
//12. Peça um número e diga se é par ou ímpar.

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner resultado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = resultado.nextInt();
        if (numero % 2 ==0){
            System.out.println("O número Par " +numero);
        }else{
            System.out.println("O número Impar "+numero);
        }
        resultado.close();
    }
}
