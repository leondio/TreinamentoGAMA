package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int qdtNomes;

        System.out.println("Digite abaixo a quantidade de nomes que irá digitar");
        qdtNomes = in.nextInt();
        String nomes[] = new String[qdtNomes];
        in.nextLine();

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome da " + (i + 1) + "° pessoa abaixo.");
            nomes[i] = in.nextLine();
        }
        System.out.print("Nomes em ordem inversa: ");
        for (int i = (nomes.length - 1); i > 0; i--) {
            System.out.print(nomes[i] + ", ");
        }
        System.out.println(nomes[0]);
        in.close();
    }
}