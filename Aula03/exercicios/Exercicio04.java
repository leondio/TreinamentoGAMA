package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int entrada, count = 0, par = 0, impar = 0;
        String parString = "", imparString = "";

        while (count < 10) {
            System.out.println("Digite abaixo o " + (count + 1) + "° número.");
            entrada = in.nextInt();
            count++;
            if (entrada % 2 == 0) {
                par++;
                parString = parString + entrada + " ";
            } else {
                impar++;
                imparString = imparString + entrada + " ";
            }
        }
        in.close();
        System.out.println("\nQuantidade de números pares: " + par + "\nNúmeros pares: " + parString);
        System.out.println("\nQuantidade de números ímpares: " + impar + "\nNúmero ímpares: " + imparString);
    }
}