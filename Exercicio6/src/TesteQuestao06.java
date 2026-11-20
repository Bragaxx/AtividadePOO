public class TesteQuestao06 {
    public static void main(String[] args) {
        FiguraGeometrica quadrado = new Quadrado("Azul", 4.0);
        FiguraGeometrica circulo = new Circulo("Vermelho", 3.0);

        System.out.printf("Quadrado %s - Area: %.2f%n",
                quadrado.getCor(), quadrado.calcularArea());
        System.out.printf("Circulo %s - Area: %.2f%n",
                circulo.getCor(), circulo.calcularArea());
    }
}
