package exercicios.exercicio02;

public class Proprietario {
    private String nome, telefone;

    public Proprietario(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}