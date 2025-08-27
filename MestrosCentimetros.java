package nivel_basico;
//10. Leia um número e converta de metros para centímetros.

import java.util.Scanner;

public class MestrosCentimetros {
    public static void main(String[] args) {
        Scanner calcular = new Scanner(System.in);
        System.out.println("Digite em Metros: ");
        double metros = calcular.nextDouble();
        double centimetros = metros * 100;
        System.out.println("Metros -> Centímetros: "+centimetros);
        calcular.close();
    }
}
