package sample;

import java.util.Scanner;

/**
 * Sample02: Ler sempre como string e converter para o tipo adequado 
 * evitando ENTER "perdido" no buffer
 */

public class sample02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor;
        String nome;

        System.out.println("Digite um número:");
        valor = Integer.parseInt(in.nextLine());
        System.out.println("Digite um nome");
        nome = in.nextLine();

        System.out.println("Olá " + nome + " , " + valor);
        in.close();
    }
}