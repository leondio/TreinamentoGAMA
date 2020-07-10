package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario, prestacao;

        System.out.println("Por favor, digite abaixo o valor do seu salário bruto.");
        salario = in.nextDouble();

        System.out.println("Agora digite abaixo o valor desejado para prestação da linha de crédito.");
        prestacao = in.nextDouble();

        if (prestacao > (0.3*salario)) {
            System.out.println("Desculpe, mas o empréstimo não pode ser concedio nestas condições.");
        } else {
            System.out.println("O empréstimo pode ser concedido.");   
        }
        in.close();
    }
}
