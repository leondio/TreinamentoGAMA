package exercicios.exercicio04;

public class Pessoa extends FilaDePrioridade{
    private String nome;
    private String senha;

    public Pessoa(String nome, int prioridade, int posicao) {
        this.nome = nome;
        if (prioridade == 1) {
            this.senha = ("P" + (posicao+1));
        } else {
            this.senha = ("N" + (posicao+1));
        }
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Senha: " + senha;
    }
}