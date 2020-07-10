package samples;

public class Sample06 {
    public static void main(String[] args) {
        funcaoA();
    }

    static void funcaoA(){
        System.out.println("Inicio da Função A");
        funcaoB();
        System.out.println("Final da Função A");
    }

    static void funcaoB(){
        System.out.println("Inicio da Função B");
        funcaoC();
        System.out.println("Final da Função B");
    }
    static void funcaoC(){
        System.out.println("Inicio da Função C");
        System.out.println("Final da Função C");    
    }
}