package exercicios.exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        Placar jogo1 = new Placar();
        Placar jogo2 = new Placar("Corinthians", "São Paulo");
        Placar jogo3 = new Placar("Corinthians", "São Paulo", 7, 0);

        System.out.println(jogo1.exibir());
        System.out.println(jogo2.exibir());
        System.out.println(jogo3.exibir());
    }
}