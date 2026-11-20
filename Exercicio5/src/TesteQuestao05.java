public class TesteQuestao05 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos", 3000.0);
        Funcionario gerente = new Gerente("Mariana", 5000.0, 1000.0);

        System.out.println("FICHA DO FUNCIONARIO");
        funcionario.imprimirFicha();
        System.out.println("\nFICHA DO GERENTE");
        gerente.imprimirFicha();
    }
}
