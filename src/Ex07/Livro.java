package Ex07;

public class Livro {

    //atributos
    private String titulo;

    private String autor;

    private String categoria;

    private int numPagina;

    private int ISBN;


    //método constructor para o livro
    public Livro(String titulo, String autor, String categoria, int numPagina, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numPagina = numPagina;
        this.ISBN = ISBN;
    }

    //método para exibir todos os detalhes
    public void exibirDetalhes() {
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(categoria);
        System.out.println(numPagina);
        System.out.println(ISBN);
    }
}
