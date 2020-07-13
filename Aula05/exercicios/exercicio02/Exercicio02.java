package exercicios.exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a hora");
        int hora = in.nextInt();

        System.out.println("Digite o minuto");
        int minuto = in.nextInt();

        System.out.println("Digite o segundo");
        int segundo = in.nextInt();

        Relogio relogio = new Relogio(hora, minuto, segundo);

        System.out.println(relogio.exibir());
        in.close();
    }
}