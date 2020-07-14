package exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio03 {
    public static void main(String[] args) {

        String entrada;
        Stack<Character> pilha = new Stack<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Digite abaixo a frase desejada.");
        entrada = in.nextLine();

        for (int i = 0; i < entrada.length(); i++) {
            if (entrada.charAt(i) != ' ') {
                pilha.push(entrada.charAt(i));
            } else {
                while (!pilha.isEmpty()) {
                    System.out.print(pilha.pop());
                }
                System.out.print(" ");
            }
        }
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
            in.close();
        }
    }
}