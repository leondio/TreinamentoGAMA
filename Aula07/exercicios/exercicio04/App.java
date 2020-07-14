package exercicios.exercicio04;

public class App {
    public static void main(String[] args) {
        FilaDePrioridade fila = new FilaDePrioridade();

        System.out.println(fila.adicionar("Leonardo", 1));
        System.out.println(fila.adicionar("Jessica", 1));
        System.out.println(fila.adicionar("Eduardo", 1));
        System.out.println(fila.adicionar("Vitor", 2));
        System.out.println(fila.adicionar("Sergio", 2));
        System.out.println(fila.adicionar("Bruno", 1));
        
        System.out.println(fila.listar());

        fila.atender();
        fila.atender();
        fila.atender();

        System.out.println(fila.listar());
    }
}