package samples;

import java.util.Random;

public class Sample01 {

    public static void main(String[] args) {
        Random rnd = new Random();

        int n = rnd.nextInt(); //Espera qualquer número

        int b = rnd.nextInt(10); //Espera um número de 0 a 9
    }
}