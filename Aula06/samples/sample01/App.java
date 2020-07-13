package samples.sample01;

public class App {
    public static void main(String[] args) {
        Gerente gerente = new Gerente ("Marcos Silva", 3000, 8);
        Funcionario funcionario = new Funcionario("Camlia", 4000);

        //gerente.teste();

        System.out.println(gerente);
        //System.out.println(funcionario.exibir());

        System.out.println(funcionario);
    }
}