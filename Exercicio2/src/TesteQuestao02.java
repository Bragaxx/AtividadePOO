public class TesteQuestao02 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Ana", 100.0);
        conta.depositar(50.0);
        conta.sacar(30.0);
        System.out.printf("Titular: %s | Saldo: R$ %.2f%n",
                conta.getTitular(), conta.getSaldo());

        conta.sacar(200.0);
        System.out.printf("Saldo apos tentativa recusada: R$ %.2f%n",
                conta.getSaldo());

        try {
            conta.setTitular("   ");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            conta.setSaldo(-10.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
