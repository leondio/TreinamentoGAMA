package exercicios.exercicio01;

public class Conta {
    private int conta;
    private double saldo;

    public Conta(int conta) {
        this.conta = conta;
        saldo = 0;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nConta: " + conta + "\nSaldo: R$" + saldo;
    } 

    public String depositar(double valor){
        setSaldo(getSaldo() + valor);
        return "\nDeposito de R$" + valor + " realizado com sucesso" + "\nSaldo atual: " + getSaldo();
    }

    public String sacar(double valor){
        setSaldo(getSaldo() - valor);
        return "\nSaque de R$" + valor + " realizado com sucesso" + "\nSaldo atual: " + getSaldo();
    }
}