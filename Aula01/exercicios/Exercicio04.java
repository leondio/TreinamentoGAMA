package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double medidaKM, medidaMilhas, medidaJardas, medidaPes, medidaPolegadas;

        System.out.println("Digite abaixo a medida (em km) que deseja converter");
        medidaKM = entrada.nextDouble();
        medidaMilhas = medidaKM * 0.62137;
        medidaJardas = medidaMilhas * 1760;
        medidaPes = medidaJardas * 3;
        medidaPolegadas = medidaPes * 12;
        System.out.println("Medida em pés = " + medidaPes);
        System.out.println("Medida em polegadas = " + medidaPolegadas);
        System.out.println("Medida em jardas = " + medidaJardas);
        System.out.println("Medida em milhas = " + medidaMilhas);
        entrada.close();
    }
}