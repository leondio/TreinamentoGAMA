package exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String nome;
        double salario;

        System.out.println("Olá, vamos calcular o seu novo salário. Qual seu nome?");
        nome = entrada.nextLine();
        System.out.println("Muito bem. Por favor, digite o valor de seu salário atual");
        salario = entrada.nextDouble();

        System.out.println(nome + ", o seu novo salário é de R$" + (salario * 1.25));
        entrada.close();
    }
}