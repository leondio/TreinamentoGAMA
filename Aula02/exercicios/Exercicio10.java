package exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int dia;

        System.out.println("Digite abaixo o dia da semana (Considere que segunda é o dia 1 e domingo o dia 7");
        dia = in.nextInt();
        if (dia < 8) {
            dia = (dia < 6) ? 1 : 2;
            switch (dia) {
                case 1:
                    System.out.println("\nDia útil.");
                    break;
                case 2:
                    System.out.println("\nFim de semana.");
                    break;
            }
        } else {
            System.out.println("Dia inválido!");
        }
        in.close();
    }
}
