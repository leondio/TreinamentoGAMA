package samples.sample02;

//import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        GerenciaFunc funcionarios = new GerenciaFunc();

        System.out.println("1 - Novo funcionário.");
        System.out.println("2 - Novo funcionário senior.");
        System.out.println("3 - Remover funcionário.");
        System.out.println("4 - Listar todos.");
        System.out.println("5 - Sair.");

        funcionarios.addFuncionario("Carlos Antonio", 30, 1000);
        funcionarios.addSenior("Maristela", 30, 1000);

        funcionarios.removerFuncionario("Carlos Antonio");

        System.out.println(funcionarios.listarTodos());
        //System.out.println("---------------");
        //System.out.println(funcionarios.listarTodosSenior());

        /*
         * String nome, resposta; int hrsTrabalhadas, valorPorHora; Scanner in = new
         * Scanner(System.in);
         * 
         * System.out.println("Digite abaixo o nome do funcionário"); nome =
         * in.nextLine();
         * 
         * System.out.
         * println("Digite abaixo quantas horas de trabalho o funcionário exerceu");
         * hrsTrabalhadas = in.nextInt();
         * 
         * System.out.println("Digite abaixo o valor que o funcionário recebe por hora"
         * ); valorPorHora = in.nextInt(); in.nextLine();
         * 
         * System.out.println("O funcionário é senior? (s/n)"); resposta =
         * in.nextLine();
         * 
         * if (resposta.charAt(0) == 's') { Senior senior = new Senior(nome,
         * hrsTrabalhadas, valorPorHora); System.out.println(senior.imprimir()); } else
         * { Funcionario funcionario = new Funcionario(nome, hrsTrabalhadas,
         * valorPorHora); System.out.println(funcionario.imprimir()); } in.close();
         */
    }
}