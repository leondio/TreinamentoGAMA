package samples.sample01;

public class Classe01 {
    private static int contador = 0;

    public Classe01(){
        contador++;
    }

    public int getNumeroDeObjetos(){
        return contador;
    }
}