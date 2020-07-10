package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int entrada;
        int count = 0;

        System.out.println("Digite abaixo o número que deseja vizualizar a tabuada.");
        entrada = in.nextInt();

        System.out.println("\nTabuada do " + entrada + ":");
        while (count < 11) {
            System.out.println(entrada + " x " + count + " = " + (count * entrada));
            count++;
        }
        in.close();
    }
}