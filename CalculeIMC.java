package nivel_basico.condicionais;
//21.Calcule IMC e classifique.

import java.util.Scanner;

public class CalculeIMC {
    public static void main(String[] args) {
        Scanner calcular = new Scanner(System.in);
        System.out.print("Digite sua Altura: ");
        double altura = calcular.nextDouble();
        System.out.print("Digite sua peso");
        double peso = calcular.nextDouble();
        double imc = peso/ (altura * altura);
        System.out.println("IMC: "+imc);
        if (imc < 18.5){
            System.out.println("Classificação: Abaixo do peso.");
        }else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Classificação: Peso normal.");
        }else if (imc >= 25 && imc <= 29.9){
            System.out.println("Classificação: Sobrepeso.");
        }else{
            System.out.println("Classificação: Obesidade.");
        }
        calcular.close();
    }
}
