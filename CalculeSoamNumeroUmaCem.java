package nivel_basico.laços;
//36.Calcule a soma dos números de 1 a 100.

public class CalculeSoamNumeroUmaCem {
    public static void main(String[] args) {
        int soma = 0; // variável que vai armazenar a soma
        //int soma = 0; inicializa a soma com zero

        for (int i = 1; i <= 100; i++){ // -> percorre todos números de 1 a 100.
            soma += i; // -> acumula o valor de cada número na soma
            // soma recebe soma + i
        }
        System.out.println("A soma dos números de 1 a 100 é: " +soma);
    }
}
