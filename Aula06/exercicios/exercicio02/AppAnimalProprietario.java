package exercicios.exercicio02;

import java.util.Scanner;

public class AppAnimalProprietario {
    public static void main(String[] args) {
        GerenciaAnimal animais = new GerenciaAnimal();
        Scanner in = new Scanner(System.in);
        int escolha;
        String nome, raca, cor, nomePropritario, numProprietario, comum;
        int anoNascimento;

        System.out.println(
                "Digite abaixo a opção desejada:\n1 - Cadastrar animal e proprietário\n2 - Listar todos os animais cadastrados\n3 - Listar o nome de todos os proprietários que tenham animal de uma mesma raça\n4 - Sair");
        escolha = in.nextInt();

        while (escolha < 1 || escolha > 4) {
            System.out.println(
                    "Opção inválida.\nDigite abaixo a opção desejada:\n1 - Cadastrar animal e proprietário\n2 - Listar todos os animais cadastrados\n3 - Listar o nome de todos os proprietários que tenham animal de uma mesma raça\n4 - Sair");
            escolha = in.nextInt();
        }

        in.nextLine();

        while (escolha != 4) {
            switch (escolha) {
                case 1:
                    System.out.println("\nDigite abaixo o nome do animal");
                    nome = in.nextLine();
                    System.out.println("Digite abaixo a raça do animal");
                    raca = in.nextLine();
                    System.out.println("Digite abaixo a cor do animal");
                    cor = in.nextLine();
                    System.out.println("Digite abaixo o ano de nascimento do animal");
                    anoNascimento = in.nextInt();
                    in.nextLine();
                    System.out.println("Digite abaixo o nome do proprietário do animal");
                    nomePropritario = in.nextLine();
                    System.out.println("Digite abaixo o número do telefone do proprietário do animal");
                    numProprietario = in.nextLine();
                    animais.addAnimal(nome, raca, cor, anoNascimento, nomePropritario, numProprietario);
                    break;
                case 2:
                    System.out.println(animais.listarAnimais());
                    break;
                case 3:
                    System.out.println("\nDigite abaixo a raça que deseja consultar");
                    comum = in.nextLine();
                    System.out.println(animais.listarComum(comum));
                    break;
                default:
                    break;

            }
            System.out.println(
                    "\nDigite abaixo a opção desejada:\n1 - Cadastrar animal e proprietário\n2 - Listar todos os animais cadastrados\n3 - Listar o nome de todos os proprietários que tenham animal de uma mesma raça\n4 - Sair\n");
            escolha = in.nextInt();
            in.nextLine();
        }
        in.close();
    }
}
