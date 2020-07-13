package samples.sample02;

public class Funcionario {
    private String nome;
    private double hrsTrabalhadas, valorPorHora;

    public Funcionario(String nome, int hrsTrabalhadas, int valorPorHora) {
        this.nome = nome;
        this.hrsTrabalhadas = hrsTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public double calcularSalario(){
        return hrsTrabalhadas*valorPorHora;
    }
    
    public double getHrsTrabalhadas() {
        return hrsTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }
    
    public String imprimir(){
        return "\nNome do Funcionário: " + nome + "\nSalário: R$" + calcularSalario();
    }
}