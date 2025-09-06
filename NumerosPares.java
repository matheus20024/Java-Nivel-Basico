package nivel_basico.laços;
//32.Escreva os números pares de 1 a 100.

public class NumerosPares {
    public static void main(String[] args) {
        // int i = 2 -> começa a variável i no número 2
        // i <=100 -> o loop continua enquanto i for menor ou igual a 100
        // i += 2 _> a cada repetição, soma 2 a i. Isso garante que ele só pega números pares (2, 4, 6, ...,10)
        for (int i = 2; i <= 100; i += 2){
            System.out.println(i);
        }
    }
}
