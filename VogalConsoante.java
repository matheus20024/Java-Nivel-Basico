package nivel_basico.condicional;
//24.Peça um caractere e diga se é vogal ou consoante

import java.util.Scanner;

public class VogalConsoante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um caractere: ");
        // entrada.next() -> lê a próxima palavra digitada.
        // .toLowerCase() -> transforma em minúscula (assim não precisa tratar maiúscula separadamente)
        // .charAt(0) -> pega só o primeiro caractere digitado
        char letra = entrada.next().toLowerCase().charAt(0);

        // verifica se realmente é uma letra (e não número, espaço, símbolo etc)
        // O método (Character.isLetter(letra)) retorna true se o caractere for uma letra (a-z ou A-Z, inclusive acentos).
        if (Character.isLetter(letra)){
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'  ){
                System.out.println("É uma vogal.");
            }else{
                System.out.println("É uma consoante.");
            }
        }else{
            System.out.println("Não é uma letra");
        }
        entrada.close();
    }
}
