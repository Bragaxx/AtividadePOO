public class TesteQuestao10 {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(new LivroProduto(
                "Dom Casmurro", 39.90, "Machado de Assis"));
        carrinho.adicionarProduto(new EletronicoProduto(
                "Fone de ouvido", 150.0, 12));

        carrinho.exibirProdutos();
        System.out.printf("Total do pedido: R$ %.2f%n",
                carrinho.calcularTotalPedido());

        try {
            carrinho.adicionarProduto(new LivroProduto(
                    "Produto invalido", 0.0, "Autor de teste"));
        } catch (IllegalArgumentException e) {
            System.out.println("Produto recusado: " + e.getMessage());
        }
        System.out.printf("Total apos tentativa invalida: R$ %.2f%n",
                carrinho.calcularTotalPedido());
    }
}
