package exercicios.exercicio02;

import java.util.ArrayList;

public class GerenciaAnimal {
    private ArrayList<Animal> animais;

    public GerenciaAnimal(){
        animais = new ArrayList<>();
    }

    public void addAnimal(String nome, String raca, String cor, int anoNascimento, String nomePropritario, String numProprietario){
        Animal animal = new Animal(nome, raca, cor, anoNascimento, nomePropritario, numProprietario);
        animais.add(animal);
        System.out.println("\nAnimal cadastrado.");
    }

    public String listarAnimais(){
        String saida = "";

        for (Animal animal : animais) {
            saida += animal + "\n";
        }
        return saida;
    }

    public String listarComum(String comum){
        String saida = "";

        for (Animal animal : animais) {
            if (animal.getRaca().equals(comum)) {
                saida += animal + "\n";
            }
        }
        return saida;
    }
}