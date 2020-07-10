package exercicios.exercicio07;

import java.util.Scanner;

public class Appv2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String modelo, marca;
        int escolha, consumo;

        System.out.println("Olá, qual ação deseja realizar?\n1 - Consultar carros cadastrados\n2 - Cadastrar novo carro");
        escolha = in.nextInt();
        while (escolha != 1 || escolha != 2) {
            System.out.println("Opção inválida. qual ação deseja realizar?\n1 - Consultar carros cadastrados\n2 - Cadastrar novo carro");
        }
        
        if (escolha == 1) {
            
        } else {
            in.nextLine();
            System.out.println("Muito bem, comece digitando abaixo o modelo do carro:");
            modelo = in.nextLine();
            System.out.println("Certo. Agora digite abaixo a marca do carro:");
            marca = in.nextLine();
            System.out.println("Para finalizar, digite abaixo o consumo (km/L) do carro:");
            consumo = in.nextInt();
        }

        in.close();
    }
}