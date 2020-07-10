package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, exame, media;
        int faltas;

        System.out.println("Favor digitar a quantidade de faltas abaixo.");
        faltas = in.nextInt();

        if (faltas >= 16) {
            System.out.println("Você foi reprovado por faltas.");
        } else {
            System.out.println("Favor digitar abaixo a sua nota 1");
            nota1 = in.nextDouble();
            System.out.println("Favor digitar abaixo a sua nota 2");
            nota2 = in.nextDouble();
            System.out.println("Favor digitar abaixo a sua nota 3");
            nota3 = in.nextDouble();
            System.out.println("Favor digitar abaixo a sua nota 4");
            nota4 = in.nextDouble();

            media = (nota1 + nota2 + nota3 + nota4) / 4;

            if (media < 6) {
                System.out.println("Favor digitar abaixo a nota do seu exame");
                exame = in.nextDouble();
                media = (media + exame)/2;
                if (media >= 5) {
                    System.out.println("Você foi aprovado com exame e sua média foi " + media);
                } else {
                    System.out.println("Você foi reprovado com média " + media);
                }
            } else {
                System.out.println("Você foi aprovado com média " + media);
            }
        }
        in.close();
    }
}