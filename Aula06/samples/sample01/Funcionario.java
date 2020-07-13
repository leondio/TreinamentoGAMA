package samples.sample01;

/**
 * Funcionario
 */

//classe implicita Object
public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String exibir(){
        return nome + ": " + salario;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return nome + ": " + salario;
    }
}