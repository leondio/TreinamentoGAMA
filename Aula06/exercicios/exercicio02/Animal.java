package exercicios.exercicio02;

public class Animal {
    private String nome, raca, cor;
    private int anoNascimento;
    private Proprietario proprietario;

    public Animal(String nome, String raca, String cor, int anoNascimento, String nomePropritario, String numProprietario) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.anoNascimento = anoNascimento;
        proprietario = new Proprietario(nomePropritario, numProprietario);
    }
    
    public int getAnoNascimento() {
        return anoNascimento;
    }

    public String getCor() {
        return cor;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nome do animal: " + nome + "\nRaça: " + raca + "\nCor: " + cor + "\nAno de nascimento: " + anoNascimento + "\nNome do Proprietário: " + proprietario.getNome() + "\nTelefone: " + proprietario.getTelefone();
    }
}