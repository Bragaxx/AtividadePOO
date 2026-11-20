public class EletronicoProduto extends Produto {
    private int mesesGarantia;

    public EletronicoProduto(String nome, double preco, int mesesGarantia) {
        super(nome, preco);
        this.mesesGarantia = mesesGarantia;
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Eletronico: %s | Garantia: %d meses | Preco: R$ %.2f%n",
                getNome(), mesesGarantia, getPreco());
    }
}
