public class Diretor implements Autenticavel {
    private final String tokenSeguranca;

    public Diretor(String tokenSeguranca) {
        if (tokenSeguranca == null || tokenSeguranca.isEmpty()) {
            throw new IllegalArgumentException("O token nao pode ser vazio.");
        }
        this.tokenSeguranca = tokenSeguranca;
    }

    @Override
    public boolean autenticar(String credencial) {
        return tokenSeguranca.equals(credencial);
    }
}
