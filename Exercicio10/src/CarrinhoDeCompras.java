import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        if (p == null) {
            throw new IllegalArgumentException("O produto nao pode ser nulo.");
        }
        produtos.add(p);
    }

    public double calcularTotalPedido() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public void exibirProdutos() {
        for (Produto produto : produtos) {
            produto.exibirDetalhes();
        }
    }
}
