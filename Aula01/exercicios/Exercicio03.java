package exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioMin, quiloW, valorW, valorResidencia;

        System.out.println("Digite abaixo o valor do salário mínimo");
        salarioMin = entrada.nextDouble();
        System.out.println("Digite abaixo a quantidade de quilowatts consumida em sua residência");
        quiloW = entrada.nextDouble();
        valorW = salarioMin/500;
        valorResidencia = valorW*quiloW;

        System.out.println("Valor do quilowatt: R$" + valorW);
        System.out.println("Valor a ser pago: R$" + valorResidencia);
        System.out.println("Valor a ser pago com 15% de desconto: R$" + (valorResidencia*0.85));
        entrada.close();
    }
}