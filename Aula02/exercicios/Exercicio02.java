package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite abaixo a sua Nota 1.");
        double Nota1 = in.nextFloat();

        System.out.println("Digite abaixo a sua Nota 2.");
        double Nota2 = in.nextFloat();

        double media = (0.4 * Nota1) + (0.6 * Nota2);

        if (media >= 6) {
            System.out.println("Sua média é " + media + ". Parabéns, você foi aprovado!");
        } else {
            System.out.println("Sua média é " + media + ". Você foi reprovado.");
        }
        in.close();
    }
}