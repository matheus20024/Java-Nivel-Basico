package nivel_basico.laços;
//31.Escreva os números de 1 a 10

public class EntreUmeDez {
    public static void main(String[] args) {
        // for (int i = 1; i <= 10; i++) {...}
        // aqui criamos um laço de repetição

        // int i = 1; -> começa com i =1.
        // i <= 10; -> o laço continua enquanto i for menor ou igual a 10.
        // i++ -> no final de cada repetição repetição, o valor de i aumenta em 1
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // primeira execução: i = 1 -> imprime 1.
        // segunda execução: i = 2 -> imprime 2.///
        // ... continua assim até i = 10.
        // quando i  vera 11, a condição 1 <= 10 [e falsa e o laço para.
    }
}
