package nivel_basico.condicional;
//30.Verifique se um número é divisível por 2 e 3.

import java.util.Scanner;

public class DivisivelDoisTres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = entrada.nextDouble();
        if (numero % 2 ==0 && numero % 3 ==0){
            System.out.println("O número é divisível por 2 e 3.");
        }else{
            System.out.println("O número não é divisível por 2 e 3.");
        }
        entrada.close();
    }
}
