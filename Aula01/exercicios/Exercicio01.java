package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        double p1, p2, media;

        System.out.println("Olá, bem vindo a calculadora de média aritimética. Qual seu nome?");
        nome = entrada.nextLine();
        System.out.println("Por favor, digite a nota da P1");
        p1 = entrada.nextDouble();
        System.out.println("Digite agora a nota da P2");
        p2 = entrada.nextDouble();
        media = (p1 + p2)/2;

        System.out.println(nome + ", a sua média aritimética é de " + media);
        entrada.close();
    }
}