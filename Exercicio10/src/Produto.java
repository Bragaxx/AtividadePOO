public abstract class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        setNome(nome);
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome nao pode ser vazio.");
        }
        this.nome = nome.trim();
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (!Double.isFinite(preco) || preco <= 0) {
            throw new IllegalArgumentException("O preco deve ser finito e maior que zero.");
        }
        this.preco = preco;
    }

    public abstract void exibirDetalhes();
}
