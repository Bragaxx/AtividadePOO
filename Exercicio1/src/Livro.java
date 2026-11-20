public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro() {
        this("Sem titulo", "Autor desconhecido", 0.0);
    }

    public Livro(String titulo, String autor) {
        this(titulo, autor, 0.0);
    }

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public void exibirDados() {
        System.out.printf("Titulo: %s | Autor: %s | Preco: R$ %.2f%n",
                titulo, autor, preco);
    }
}
