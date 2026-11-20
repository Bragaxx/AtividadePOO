public class Cliente implements Autenticavel {
    private final String senha;

    public Cliente(String senha) {
        if (senha == null || senha.isEmpty()) {
            throw new IllegalArgumentException("A senha nao pode ser vazia.");
        }
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String credencial) {
        return senha.equals(credencial);
    }
}
