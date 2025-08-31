package nivel_basico.condicional;
//27.Peça o valor de um produto e calcule o desconto.

import java.util.Scanner;

public class ProdutoDesconto {
    public static void main(String[] args) {
        Scanner entradaProduto = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double produto = entradaProduto.nextDouble();
        double desconto = 20.0;
        double calcularDesconto = produto * (desconto/100);
        double precoFinal = produto - calcularDesconto;
        System.out.println("Preço do produto com desconto de 20%, preço "+precoFinal);
        entradaProduto.close();
    }
}
