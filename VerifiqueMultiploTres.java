package nivel_basico.condicionais;
//13.Verifique se um número é múltiplo de 3.

import java.util.Scanner;

public class VerifiqueMultiploTres {
    public static void main(String[] args) {
        Scanner verificar = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = verificar.nextDouble();
        if ( numero % 3 == 0){
            System.out.println("É múltiplo de 3: " +numero);
        }else{
            System.out.println("Não é múltiplo de 3: "+numero);
        }
        verificar.close();
    }
}
