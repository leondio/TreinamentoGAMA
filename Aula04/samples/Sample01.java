package samples;

import java.util.Scanner;

public class Sample01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tamanho;

        //int []valores, numeros; //ambos são vetores
        //int valores[], numeros; //valores é vetor e números é int

        int []valores;

        System.out.println("Informe quantos valores serão digitados:");
        tamanho = in.nextInt();

        valores = new int[tamanho];

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° numero:");
            valores[i] = in.nextInt();
        }
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
        in.close();
    }
}