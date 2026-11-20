public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        setTitular(titular);
        setSaldo(saldoInicial);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("O titular nao pode ser vazio.");
        }
        this.titular = titular.trim();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (!Double.isFinite(saldo) || saldo < 0) {
            throw new IllegalArgumentException("O saldo deve ser finito e nao negativo.");
        }
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        validarValor(valor);
        double novoSaldo = saldo + valor;
        if (!Double.isFinite(novoSaldo)) {
            throw new IllegalArgumentException("Deposito acima do limite numerico.");
        }
        saldo = novoSaldo;
    }

    public void sacar(double valor) {
        validarValor(valor);
        if (valor > saldo) {
            System.out.println("Erro: saldo insuficiente para realizar o saque.");
            return;
        }
        saldo -= valor;
    }

    private void validarValor(double valor) {
        if (!Double.isFinite(valor) || valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser finito e positivo.");
        }
    }
}
