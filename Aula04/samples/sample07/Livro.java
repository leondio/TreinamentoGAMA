package samples.sample07;

public class Livro {
    //atributos
    String titulo, autor;
    int numPaginas;

    //método construtor
    Livro(String titulo, String autor, int numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    //métodos
    String exibir(){
        return (titulo + ": " + autor + " (" + numPaginas + ")");
    }

}