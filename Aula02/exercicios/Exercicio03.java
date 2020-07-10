package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        float numeroUm, numeroDois;

        System.out.println("Digite abaixo o primerio número.");
        numeroUm = in.nextFloat();

        System.out.println("Digite abaixo o segundo número.");
        numeroDois = in.nextFloat();

        if (numeroUm>numeroDois) {
            System.out.println("\n" + numeroUm + ", " + numeroDois);
        } else {
            System.out.println("\n" + numeroDois + ", " + numeroUm);            
        }
        in.close();
    }
}