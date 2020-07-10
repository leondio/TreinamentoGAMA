package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double entrada, positivos = 0, soma = 0, limite;
     
        System.out.println("Digite abaixo quantidade de número que irá digitar:");
        limite = in.nextDouble();

        for (int i = 0; i < limite; i++) {
            System.out.println("Digite abaixo o " + (i + 1) + "° número:");
            entrada = in.nextInt();
            soma = soma + entrada;
            if (entrada > 0) {
                positivos++;
            } else {
            }
        }
        System.out.println("\nQuantidade de números positivos: " + positivos);
        System.out.println("Média dos números digitados = " + (soma/limite));
        System.out.println("Quantidade percentual de positivos = " + (positivos*(100/limite)) + "%");
        in.close();
    }
}