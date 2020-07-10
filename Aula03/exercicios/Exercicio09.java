package exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int resposta, soma = 0;

        do {
            System.out.println("Digite abaixo um valor (0 = fim )");
            resposta = in.nextInt();
            soma += resposta;
        } while (resposta != 0);
        System.out.println("Final: " + soma);
        in.close();
    }
}