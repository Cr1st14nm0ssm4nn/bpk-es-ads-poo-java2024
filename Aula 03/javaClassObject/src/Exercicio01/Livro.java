package Exercicio01;

/*Crie uma classe chamada Livro com atributos como titulo, autor, e numeroDePaginas.
Adicione métodos para abrir o livro e ler uma página.*/

public class Livro {
    private String titulo;
    private String autor;
    private Integer numPaginas;

    public Livro(String titulo, String autor, Integer numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
