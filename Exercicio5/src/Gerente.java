public class Gerente extends Funcionario {
    private double bonusEscopo;

    public Gerente(String nome, double salarioBase, double bonusEscopo) {
        super(nome, salarioBase);
        this.bonusEscopo = bonusEscopo;
    }

    @Override
    public double calcularVencimentos() {
        return getSalarioBase() * 1.20 + bonusEscopo;
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Cargo: Gerente");
        System.out.printf("Bonus de escopo: R$ %.2f%n", bonusEscopo);
        System.out.printf("Vencimentos: R$ %.2f%n", calcularVencimentos());
    }
}
