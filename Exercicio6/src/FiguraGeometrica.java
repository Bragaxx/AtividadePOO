public abstract class FiguraGeometrica {
    private String cor;

    public FiguraGeometrica(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public abstract double calcularArea();
}
