package nivel_basico.condicional;
//22.Verifique se o número está fora do intervalo 50–100.

import java.util.Scanner;

public class VerifiqueIntervalo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        if (numero >=50 && numero <=100){
            System.out.println(numero+" está dentro do intervalo 50-100");
        }else{
            System.out.println(numero+" está fora do intervalo 50-100");
        }
        entrada.close();
    }
}
