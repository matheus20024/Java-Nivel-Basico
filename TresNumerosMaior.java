package nivel_basico.condicionais;
//17.Peça três números e mostre o maior.

import java.util.Scanner;

public class TresNumerosMaior {
    public static void main(String[] args) {
        Scanner verificarMaior = new Scanner(System.in);
        System.out.print("Digite primeiro número: ");
        double numero1 = verificarMaior.nextDouble();
        System.out.print("Digite segundo número: ");
        double numero2 = verificarMaior.nextDouble();
        System.out.print("Digite terceiro número: ");
        double numero3 = verificarMaior.nextDouble();
        if (numero1 >= numero2 && numero1 >= numero3){
            System.out.println("O número "+numero1+" é maior de todos.");
        }else if (numero2 >=  numero1 && numero2 >= numero3){
            System.out.println("O número "+numero2+" é maior de todos.");
        }if (numero3 >= numero1 && numero3 >= numero2){
            System.out.println("O número "+numero3+" é maior de todos.");
        }
        verificarMaior.close();
    }
}
