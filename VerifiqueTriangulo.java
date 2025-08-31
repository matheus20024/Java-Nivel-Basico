package nivel_basico.condicional;
//29.Verifique se é possível formar um triângulo com 3 lados.

import java.util.Scanner;

public class VerifiqueTriangulo {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        System.out.print("Digite lado A: ");
        double ladoA = entradaDados.nextDouble();
        System.out.print("Digite lado B: ");
        double ladoB = entradaDados.nextDouble();
        System.out.print("Digite lado C: ");
        double ladoC = entradaDados.nextDouble();
        if ( ladoA + ladoB > ladoC && ladoB + ladoC > ladoA && ladoC + ladoA > ladoB){
            System.out.println("É possível formar um triãngulo.");
        }else{
            System.out.println("Não é possível formar um triângulo.");
        }
        entradaDados.close();
    }
}
