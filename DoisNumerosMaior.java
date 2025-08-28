package nivel_basico.condicionais;
// 16.Peça dois números e diga qual é maior

import java.util.Scanner;

public class DoisNumerosMaior {
    public static void main(String[] args) {
        Scanner saberMaior = new Scanner(System.in);
        System.out.print("Digite primeiro número: ");
        double numero1 = saberMaior.nextDouble();
        System.out.print("Digite segundo número: ");
        double numero2 = saberMaior.nextDouble();
        if (numero1 >= numero2){
            System.out.println(numero1+" é maior que "+numero2);
        }else{
            System.out.println(numero1+" é maior que "+numero2);
        }
        saberMaior.close();
    }
}
