package samples;

import java.util.ArrayList;

public class SampleArray {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();
        // Funcionario func = new Funcionar();

        lista.add(12);
        lista.add(7);
        lista.add(35);
        lista.add(98);

        lista.remove((Integer) 35);
        lista.remove(1);

        System.out.println(lista);

        lista2.add("Huguinho");
        lista2.add("Zezinho");
        lista2.add("Luizinho");
        lista2.add("Patinhas");
        lista2.add(2, "Maga");

        // lista2.remove(1);

        System.out.println(lista2);

        for (int i = 0; i < lista2.size(); i++) {
            if (lista2.get(i).charAt(0) == 'P') {
                System.out.println("Tio");
            } else {
                System.out.println(lista2.get(i));
            }
        }

        /* for (String nome : lista2) {
            nome += "-";
        }
        System.out.println(lista2); */
    }
}