package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, menorNumero = 0, maiorNumero = 0;

        System.out.println("Digite abaixo a quantidade de numeros que ira digitar:");
        int qtdNumeros = in.nextInt();
        
        System.out.println("Digite abaixo o 1° número:");
        numero = in.nextInt();
        maiorNumero = numero;
        menorNumero = numero;
        
        for (int i = 1; i < qtdNumeros; i++) {
            System.out.println("Digite abaixo o " + (i + 1) + "° número:");
            numero = in.nextInt();
            
            if (numero > maiorNumero) {
                maiorNumero = numero;
            } else {
            }
            if (numero < menorNumero) {
                menorNumero = numero;
            } else {
            }
        }
        System.out.println("Maior número digitado: " + maiorNumero);
        System.out.println("Menor número digitado: " + menorNumero);
        in.close();
    }
}