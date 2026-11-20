public class TesteQuestao04 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos", 3000.0);
        Gerente gerente = new Gerente("Mariana", 5000.0, 1000.0);

        System.out.printf("%s - Vencimentos: R$ %.2f%n",
                funcionario.getNome(), funcionario.calcularVencimentos());
        System.out.printf("%s - Vencimentos: R$ %.2f%n",
                gerente.getNome(), gerente.calcularVencimentos());
    }
}
