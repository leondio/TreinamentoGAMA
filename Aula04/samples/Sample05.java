package samples;

public class Sample05 {
    public static void main(String[] args) {
        
        System.out.println(exibir());

    }

    static int soma(int n1, int n2){
        int resultado;
        
        resultado = n1 + n2;
        
        return resultado;
    }

    static String exibir(){
        int valor;

        valor = soma(10, 5);

        return ("Resultado = " + valor);
    }
}