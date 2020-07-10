package exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double n1, n2;
        String frase;
        char sinal;

        System.out.println(
                "Favor digitar abaixo qual operação deseja realizar (Exemplo: Adição = +, Subtração = -, Divisão = / e Multiplização = *");
        frase = in.next();
        sinal = frase.charAt(0);

        System.out.println("Favor digitar quais números estarão presentes nesta operação");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        switch (sinal) {
            case '+':
                System.out.println("Resultado: " + (n1 + n2));
                break;
            case '-':
                System.out.println("Resultado: " + (n1 - n2));
                break;
            case '*':
                System.out.println("Resultado: " + (n1 * n2));
                break;
            case '/':
                if (n2 <= 0) {
                    System.out.println(
                            "Impossível realizar esta operação pois o número divisor digitado é menor ou igual a zero.");
                            break;
                } else {
                    System.out.println("Resultado :" + (n1 / n2));
                    break;
                }
            default:
                System.out.println("Sinal inválido!");
                break;
        }
        in.close();
    }
}