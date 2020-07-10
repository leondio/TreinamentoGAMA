package exercicios.exercicio07;

public class App {
    public static void main(String[] args) {
        Veiculo Leonardo = new Veiculo("Montana", "Chevrolet", 12);
        Veiculo Vanessa = new Veiculo("Punto", "Fiat", 14);

        System.out.println("Dados do carro do Leonardo: \n" + Leonardo.exibir() + "\nConsumo: " + Leonardo.consumo() + "km/L");
        System.out.println("\nDados do carro da Vanessa: \n" + Vanessa.exibir() + "\nConsumo: " + Vanessa.consumo() + "km/L");
        
    }
}