package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;

        System.out.println("Digite o valor do comprimento do lado a");
        a = in.nextDouble();

        System.out.println("Digite o valor do comprimento do lado b");
        b = in.nextDouble();

        System.out.println("Digite o valor do comprimento do lado c");
        c = in.nextDouble();

        if ((a > b + c) || (b > a + c) || (c > a + b)) {
            System.out.println("Não forma nenhum triâgulo.");
        } else {
            if ((a == b) && (a == c)) {
                System.out.println("Forma um triângulo equilátero");
            } else {
                if ((a == b) || (b == c) || (a == c)) {
                    System.out.println("Forma um triângulo isósceles");
                } else {
                    System.out.println("Forma um triângulo escaleno");
                }
            }
        }
        in.close();
    }
}
