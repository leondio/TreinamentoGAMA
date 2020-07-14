package exercicios.exercicio04;

import java.util.LinkedList;
import java.util.Queue;

public class FilaDePrioridade {
    private Queue<String> filaNormal;
    private Queue<String> filaPrioritaria;
    private int count = 0;

    public FilaDePrioridade() {
        this.filaNormal = new LinkedList<>();
        this.filaPrioritaria = new LinkedList<>();
    }

    public String adicionar(String nome, int prioridade) {
        if (prioridade == 1) {
            Pessoa pessoa = new Pessoa(nome, prioridade, getTamanhoFilaPrioritaria());
            filaPrioritaria.add(pessoa.toString());
            return "\n" + nome + " entrou na fila. Senha: " + pessoa.getSenha();
        } else {
            Pessoa pessoa = new Pessoa(nome, prioridade, getTamanhoFilaNormal());
            filaNormal.add(pessoa.toString());
            return "\n" + nome + " entrou na fila. Senha: " + pessoa.getSenha();
        }
    }

    public String atender() {
        if (!filaPrioritaria.isEmpty() && count < 2) {
            filaPrioritaria.remove();
            count++;
            return "Cliente atendido";
        } else {
            if (!filaNormal.isEmpty()) {
                filaNormal.remove();
                count = 0;
                return "Cliente atendido";
            } else {
                count = 0;
                return "Não há ninguém na fila";
            }
        }
    }

    public String listar() {
        String filaN = "", filaP = "";
        for (String pessoa : filaNormal) {
            filaN += pessoa.toString() + "\n";
        }
        for (String pessoa : filaPrioritaria) {
            filaP += pessoa.toString() + "\n";
        }
        return "\nFila comum\n" + filaN + "\nFila Prioritária\n" + filaP;
    }

    public int getTamanhoFilaNormal() {
        return filaNormal.size();
    }

    public int getTamanhoFilaPrioritaria() {
        return filaPrioritaria.size();
    }

}