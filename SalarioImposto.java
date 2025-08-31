package nivel_basico.condicional;
//28.Peça o salário e calcule imposto (por faixas).

import java.util.Scanner;

public class SalarioImposto {
    public static void main(String[] args) {
        Scanner verificarImposto = new Scanner(System.in);
        System.out.print("Digite seu salário: ");
        final double salario = verificarImposto.nextDouble();
        double imposto = 0.0;
        if ( salario <= 1000){
            imposto = 0;
        }else if (salario <= 2000){
            imposto = salario * 0.10; //10%
        }else if (salario <=3500){
            imposto = salario * 0.15; // 15%
        }else if (salario <=5000){
            imposto = salario * 0.20;
        }else{
            imposto = salario * 0.25;
        }
        double salarioliquido = salario - imposto;
        System.out.println("Imposto a pagar: R$ "+imposto);
        System.out.println("Salário Líquido: R$ "+salarioliquido);
        verificarImposto.close();
    }
}
