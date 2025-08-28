package nivel_basico.condicionais;
//19.Classifique uma idade (criança, jovem, adulto, idoso)

import java.util.Scanner;

public class ClassificacaoIdade {
    public static void main(String[] args) {
        Scanner classificandoIdade = new Scanner(System.in);
        System.out.print("Digite sua Idade: ");
        double idade = classificandoIdade.nextDouble();
        if (idade <= 17){
            System.out.println("Classificação: Criança.");
        }else if (idade >= 18 && idade <=30) {
            System.out.println("Classificação: Jovem.");
        }else if (idade >= 31 && idade <=59 ){
            System.out.println("Classificação: Adulto.");
        }if (idade >=60){
            System.out.println("Classificação: Idoso.");
        }
        classificandoIdade.close();
    }
}
