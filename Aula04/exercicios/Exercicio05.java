package exercicios;

public class Exercicio05 {
    public static void main(String[] args) {
        int menorNumero = menor(45, 20, 30);

        System.out.println("O menor número é o: " + menorNumero);
    }

    static int menor(int um, int dois, int tres) {
        int menorNum = um;
        int numero[] = new int[3];
        numero[0] = um;
        numero[1] = dois;
        numero[2] = tres;

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] < menorNum) {
                menorNum = numero[i];
            } else {
            }
        }
        return menorNum;
    }
}
