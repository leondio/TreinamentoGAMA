package samples;

import java.util.TreeSet;

public class Sample04 {
    public static void main(String[] args) {

        TreeSet<Integer> arvore = new TreeSet<>();

        int [] vetor = {2, 4, 1, 6, 3, 7, 9, 5, 1, 2, 3};

        for (int i : vetor) {
            arvore.add(i);
        }

        //percorrer a árvore : in-order
        for (Integer i : arvore) {
            System.out.print(i + " ");
        }
    }
}