package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double salario, desconto, multiplo;

        System.out.println("Digite abaixo o seu salário.");
        salario = in.nextDouble();
        if (salario < 1200) {
            desconto = 20;
            multiplo = 0.8;
        } else {
            if (salario <= 2000) {
                desconto = 25;
                multiplo = 0.75;
            } else {
                desconto = 30;
                multiplo = 0.7;
            }
        }
        if (salario <= 600) {
            System.out.println("\nSeu salário é isento do desconto do INSS.");
        } else {
            System.out.println("\nSalário com " + desconto + "% descontado pelo INSS: " + (salario*multiplo));
            }
            in.close();
        }
    }
