package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome, senha;

        System.out.println("Por favor, informe abaixo seu nome.");
        nome = in.nextLine();

        System.out.println("\nPara acessar, digite sua senha.");
        senha = in.nextLine();

        if (senha.equals("R10p5")) {
            System.out.println("\nOlá, " + nome + ". Acesso concedido.");
        } else {
            System.out.println("\nOlá, " + nome + ". Acesso negado.");
        }
        in.close();
    }
}
