package samples;

public class Sample04 {
    public static void main(String[] args) {
        int valor;

        valor = soma(10, 5);

        System.out.println("Resultado: " + valor);
    }

    static int soma(int n1, int n2){
        int resultado;
        
        resultado = n1 + n2;
        
        return resultado;
    }
}