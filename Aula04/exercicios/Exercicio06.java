package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String entrada;

        System.out.println("Digite abaixo a palavra na qual deseja descobrir quantas vogais tem.");
        entrada = in.nextLine();

        System.out.println("Quantidade de vogais na palavra digitada: " + qtasVogais(entrada.toLowerCase()));
        in.close();
    }

    static int qtasVogais (String palavra){
        /**
         * Contar vogais
         */
        int vogais = 0;
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u') {
                vogais++;
            } else {
            }
        }
        return vogais;
    }
}