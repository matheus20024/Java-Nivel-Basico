package nivel_basico.laços;
//34.Escreva a tabuada de 5

public class EscrevaTabuadaCinco {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            // for (int i = 1; i <= 10; i++) -> percorre os números de 1 a 10.
            int resultado = 5 * i;
            // int resultado = 5 * i; _> calcula o resultado da multiplicação
            System.out.println("5 x " + i + " = " +resultado);
            //System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}
