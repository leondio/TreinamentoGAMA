package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int qtdVezes, lado1 = 0, lado2 = 0, lado3 = 0, lado4 = 0, lado5 = 0, lado6 = 0;
        Random random = new Random();
        //int contagem[] = new int [6]; OUTRO MÉTODO

        System.out.println("Digite abaixo quantas vezes deseja jogar o dado");
        qtdVezes = in.nextInt();
        int lado[] = new int [qtdVezes];

        for (int i = 0; i < lado.length; i++) {
            lado[i] = 1 + random.nextInt(6);
            //contagem[lado[i]-1]++; OUTRO MÉTODO
            switch (lado[i]) {
                case 1:
                    lado1++;
                    break;
                case 2:
                    lado2++;
                    break;
                case 3:
                    lado3++;
                    break;
                case 4:
                    lado4++;
                    break;
                case 5:
                    lado5++;
                    break;
                case 6:
                    lado6++;
                    break;
            }
        }
        System.out.println("\nLado 1 sorteado: " + lado1 + " vezes.");
        System.out.println("Lado 2 sorteado: " + lado2 + " vezes.");
        System.out.println("Lado 3 sorteado: " + lado3 + " vezes.");
        System.out.println("Lado 4 sorteado: " + lado4 + " vezes.");
        System.out.println("Lado 5 sorteado: " + lado5 + " vezes.");
        System.out.println("Lado 6 sorteado: " + lado6 + " vezes.");
        in.close();
    }
}