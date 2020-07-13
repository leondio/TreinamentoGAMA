package samples.sample02;

import java.util.ArrayList;

public class GerenciaFunc {
    private ArrayList<Funcionario> funcionarios;

    public GerenciaFunc(){
        funcionarios = new ArrayList<>();
    }

    public void addFuncionario(String nome, int hrsTrabalhadas, int valorPorHora){
        Funcionario func = new Funcionario(nome, hrsTrabalhadas, valorPorHora);
        funcionarios.add(func);
    }

    public void addSenior(String nome, int hrsTrabalhadas, int valorPorHora){
        Senior senior = new Senior(nome, hrsTrabalhadas, valorPorHora);
        funcionarios.add(senior);
    }

    public boolean removerFuncionario(String nome){
        for (Funcionario funcionario : funcionarios) {
            if(funcionario.getNome().equals(nome)){
                funcionarios.remove(funcionario);
                System.out.println("Funcionario removido com sucesso.\n");
                return true;
            }
        }
        return false;
    }

    public String listarTodos(){
        String saida = "";

        for (Funcionario funcionario : funcionarios) {
            saida += funcionario.imprimir() + "\n";
        }
        return saida;
    }

    public String listarTodosSenior(){
        String saida = "";

        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Senior) {
                saida += funcionario.imprimir() + "\n";
            }
        }
        return saida;
    }
}