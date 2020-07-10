package sample;

import java.util.Scanner;

public class sample03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor;
        
        /**
        valor = -1;
        while (valor <= 0) {
            System.out.println("Digite um valor positivo > 0");
            valor = Integer.parseInt(in.nextLine());
        }
         */
        
        do {
            System.out.println("Digite um valor positivo > 0");
            valor = Integer.parseInt(in.nextLine());
        } while (valor <= 0);

        System.out.println("Finalmente...");
        in.close();
    }
}