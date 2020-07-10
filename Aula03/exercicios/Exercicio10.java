package exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int qtdAlunos, nota1, nota2;
        double somaTurma = 0;

        System.out.println("Digite abaixo a quantidade de alunos da sala:");
        qtdAlunos = in.nextInt();
        int mediaAluno[] = new int [qtdAlunos];
        
        for (int i = 0; i < qtdAlunos; i++) {
            do {
                System.out.println("Digite a nota 1 do " + (i + 1) + "° aluno.");
                nota1 = in.nextInt();
            } while (nota1 < 0 || nota1 > 10);
            do {
                System.out.println("Digite a nota 2 do " + (i + 1) + "° aluno.");
                nota2 = in.nextInt();
            } while (nota2 < 0 || nota2 > 10);
            mediaAluno[i] = (nota1 + nota2) / 2;
            somaTurma += mediaAluno[i];
        }
        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Media do aluno " + (i + 1) + " = " + mediaAluno[i]);
        }
        System.out.println("Média da Turma = " + (somaTurma/qtdAlunos));
        in.close();
    }
}
