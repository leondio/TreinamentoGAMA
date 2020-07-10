package sample;

import java.util.Scanner;

/**
 * Sample02: Ler sempre como string e converter para o tipo adequado 
 */

public class sample01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int valor;
        String entrada;

        System.out.println("Digite um número:");
        entrada = in.nextLine();

        // Validar o que foi lido

        valor = Integer.parseInt(entrada);

        System.out.println("Lido: " + valor);

        in.close();

    }
}