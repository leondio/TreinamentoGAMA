package samples;

public class Sample03 {
    public static void main(String[] args) {
        linha(10, '-');
        System.out.println("Hello World!");
        linha(10, '$');
        System.out.println("Olá");
        linha(20, '*');
        System.out.println("Olá, como vai você, meu amigo?");
        linha(30, '%');
    }

    static void linha(int tam, char simbolo){
        for (int i = 0; i < tam; i++) {
            System.out.printf("%c", simbolo);
        }
        System.out.println();
    }
}

//tipoDeRetorno NOME (){
    
//}

//void -> nada