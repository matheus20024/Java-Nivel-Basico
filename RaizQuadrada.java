package nivel_basico;
//9. Peça um número e mostre a raiz quadrada.
import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = entradaDados.nextDouble();
        /*
        Math -> é a classe matemática padrão do Java
        sqrt() -> é o método que calcula a raiz quadrada
        O retorno de Math.sqrt
         */
        double raiz = Math.sqrt(numero);
        System.out.println("Raiz quadrada é: "+raiz);
        entradaDados.close();
    }
}
