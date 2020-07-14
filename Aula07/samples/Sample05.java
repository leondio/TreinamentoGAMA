package samples;

import java.util.TreeSet;

public class Sample05 {
    public static void main(String[] args) {

        TreeSet<String> arvore = new TreeSet<>();

        String [] vetor = {"2", "4", "1", "6", "3", "7", "9", "5", "1", "2", "3"};

        for (String i : vetor) {
            System.out.println(arvore.add(i) ? "inserido" : "falha");
        }

        //percorrer a árvore : in-order
        for (String i : arvore) {
            System.out.print(i + " ");
        }
    }
}