package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double eleitores, Mario = 0, Jose = 0, Kleber = 0, Carla = 0, Nulo = 0, Branco = 0, votosValidos;
        int voto;
        
        System.out.println("Digite abaixo a quantidade de eleitores:");
        eleitores = in.nextDouble();

        for (int i = 0; i < eleitores; i++) {
            System.out.println("Digite o voto correspondente ao candidato desejado:\n1 - Mario\n2 - José\n3 - Kleber\n4 - Carla\n5 - Nulo\n6 - Em branco");
            voto = in.nextInt();
            switch (voto) {
                case 1:
                    Mario++;
                    break;
                case 2:
                    Jose++;
                    break;
                case 3:
                    Kleber++;
                    break;
                case 4:
                    Carla++;
                    break;
                case 5:
                    Nulo++;
                    break;
                case 6:
                    Branco++;
                    break;
                default:
                    System.out.println("Opção inexistente, contabilizado como voto nulo");
                    Nulo++;
                    break;
            }
        }

        votosValidos = Mario + Jose + Kleber + Carla;

        System.out.println("\nResultado:\n");
        System.out.printf("Mario: %.0f voto(s) = %.2f%% dos votos válidos.\n", Mario, (Mario*100/votosValidos));
        System.out.printf("José: %.0f voto(s) = %.2f%% dos votos válidos.\n", Jose, (Jose*100/votosValidos));
        System.out.printf("Kleber: %.0f voto(s) = %.2f%% dos votos válidos.\n", Kleber, (Kleber*100/votosValidos));
        System.out.printf("Carla: %.0f voto(s) = %.2f%% dos votos válidos.\n", Carla, (Carla*100/votosValidos));
        System.out.printf("Nulos: %.0f voto(s).\n", Nulo);
        System.out.printf("Em branco: %.0f voto(s).\n", Branco);
        System.out.printf("Percentual de votos brancos e nulos: %.2f%%.\n", ((Nulo + Branco)*100/eleitores));
        in.close();
    }
}