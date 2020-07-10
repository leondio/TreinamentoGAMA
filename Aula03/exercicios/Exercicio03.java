package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int entrada;
        int count;

        System.out.println("Digite o número LIMITE desejado");
        entrada = in.nextInt();

        count = 1;
        while (count <= entrada) {
            if (count > (entrada / 2)) {
                System.out.print(count);
                count *= 2;
            } else {
                System.out.print(count + ", ");
                count *= 2;
            }
        }
        in.close();
    }
}