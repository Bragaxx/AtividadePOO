public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularVencimentos() {
        return salarioBase * 1.10;
    }

    public void imprimirFicha() {
        System.out.println("Nome: " + nome);
        System.out.printf("Salario-base: R$ %.2f%n", salarioBase);
    }
}
