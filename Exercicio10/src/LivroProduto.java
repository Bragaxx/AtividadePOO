public class LivroProduto extends Produto {
    private String autor;

    public LivroProduto(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Livro: %s | Autor: %s | Preco: R$ %.2f%n",
                getNome(), autor, getPreco());
    }
}
