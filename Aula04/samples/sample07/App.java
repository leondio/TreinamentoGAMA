package samples.sample07;

public class App {
    public static void main(String[] args) {
        Livro livro1 = new Livro("A volta dos que não foram", "Leonardo Bobadilla", 154);
        Livro livro2 = new Livro("O trem que furou o pneu", "Lucas Fonseca", 300);

        System.out.println(livro1.exibir());
        System.out.println(livro2.exibir());
    }
}