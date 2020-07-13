package exercicios.exercicio01;

public class Senior extends Funcionario {
    private double bonus=50;

    public Senior(String nome, int hrsTrabalhadas, int valorPorHora) {
        super(nome, hrsTrabalhadas, valorPorHora);
    }

    @Override
    public double calcularSalario() {
        // TODO Auto-generated method stub
        bonus *= (super.getHrsTrabalhadas()/10);
        return super.calcularSalario()+bonus;
    }
    
    @Override
    public String imprimir() {
        // TODO Auto-generated method stub
        return "\nNome do Funcionário: " + super.getNome() + "\nSalário: R$" + calcularSalario() + " (Salário base: R$" + super.calcularSalario() + " + Bônus: R$" + bonus + ")";
    }

}