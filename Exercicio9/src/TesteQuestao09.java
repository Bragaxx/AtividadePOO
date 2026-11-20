public class TesteQuestao09 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Ana", 100.0);

        try {
            conta.sacar(150.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Saque recusado: " + e.getMessage());
        }
        System.out.printf("Saldo apos falha: R$ %.2f%n", conta.getSaldo());

        try {
            conta.sacar(40.0);
            System.out.println("Saque de R$ 40,00 realizado.");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Saque recusado: " + e.getMessage());
        }
        System.out.printf("Saldo final: R$ %.2f%n", conta.getSaldo());
    }
}
