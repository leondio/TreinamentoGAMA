package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numeroEntrada;

        System.out.println("Digite um número.");
        numeroEntrada = entrada.nextDouble();

        if (numeroEntrada > 20) {
            numeroEntrada = numeroEntrada / 2;
            System.out.println(numeroEntrada);
        }
        entrada.close();
    }
}
