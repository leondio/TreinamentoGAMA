package exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio02 {
    public static void main(String[] args) {
        String entrada;
        Stack<Character> pilha = new Stack<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Digite abaixo a frase desejada.");
        entrada = in.nextLine();

        for (int i = 0; i < entrada.length(); i++) {
            pilha.push(entrada.charAt(i));
        }
        while (!pilha.isEmpty()){
            System.out.print(pilha.pop());
        }
        in.close();
    }
}