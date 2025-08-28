package nivel_basico.condicionais;
//20.Verifique se um número está entre 100 e 200.

import java.util.Scanner;

public class VerifiqueNumeroEntreCemDuzentos {
    public static void main(String[] args) {
        Scanner verifique = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = verifique.nextInt();
        if (numero >= 100 && numero <= 200){
            System.out.println("O número "+numero+" está entre 100 e 200.");
        }else{
            System.out.println("O número "+numero+" não está entre 100 e 200.");
        }
        verifique.close();
    }
}
