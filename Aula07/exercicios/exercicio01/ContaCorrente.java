package exercicios.exercicio01;

public class ContaCorrente extends Conta {
    private double taxa = 0.10;

    public ContaCorrente(int conta) {
        super(conta);
    }

    @Override
    public String sacar(double valor) {
        if (valor <= getSaldo()) {
            return super.sacar(valor);
        } else {
            return "\nNão foi possível realizar o saque pois seu saldo é insuficiente.";
        }
    }

    @Override
    public String depositar(double valor) {
        setSaldo(getSaldo() + valor - taxa);
        return "\nDeposito de R$" + valor + " realizado com sucesso\nCusto da operação: R$" + taxa + "\nSaldo atual: " + getSaldo();
    }

    
    
    
}