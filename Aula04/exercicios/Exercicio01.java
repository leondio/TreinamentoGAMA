package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int qtdAlunos, acima = 0;
        double media = 0, soma = 0;

        System.out.println("Digite abaixo a quantidade de alunos na sala:");
        qtdAlunos = in.nextInt();

        int nota[] = new int [qtdAlunos];

        for (int i = 0; i < nota.length; i++) {
            System.out.println("Digite abaixo a nota do " + (i + 1) + "° aluno.");
            nota[i] = in.nextInt();
            soma += nota[i];
        }
        media = soma/qtdAlunos;
        System.out.println();
        for (int i = 0; i < nota.length; i++) {
            if (nota[i] > media) {
                acima++;
            } else {
            }
            System.out.println("Nota do " + (i + 1) + "° aluno: " + nota[i]);
        }
        System.out.println("Média da turma: " + media);
        System.out.println("Quantidade de notas acima da média: " + acima);
        in.close();
    }
}