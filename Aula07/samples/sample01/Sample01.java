package samples.sample01;

public class Sample01 {
    public static void main(String[] args) {
        Classe01 obj1 = new Classe01();
        System.out.println(obj1.getNumeroDeObjetos());

        Classe01 obj2 = new Classe01();
        System.out.println(obj2.getNumeroDeObjetos());

        Classe01 obj3 = new Classe01();
        Classe01 obj4 = new Classe01();
        
        System.out.println(obj3.getNumeroDeObjetos());
        System.out.println(obj4.getNumeroDeObjetos());
    }
}