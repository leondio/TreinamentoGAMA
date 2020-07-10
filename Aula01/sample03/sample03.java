package sample03;

import java.util.Scanner;

public class sample03 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String nome;


        System.out.println("Digite seu nome:");
        nome = entrada.nextLine();

        System.out.println("Olá " + nome);
        entrada.close();
        
    }
    
}