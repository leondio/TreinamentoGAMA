package exercicios.exercicio07;

public class Veiculo {
    String modelo, marca;
    int kmPorL;

    Veiculo(String modelo, String marca, int kmPorL){
        this.modelo = modelo;
        this.marca = marca;
        this.kmPorL = kmPorL;
    }

    String exibir(){
        return("Modelo: " + modelo + "\nMarca: " + marca);
    }

    int consumo(){
        return(kmPorL);
    }
}