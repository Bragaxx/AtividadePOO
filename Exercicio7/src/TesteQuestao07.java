public class TesteQuestao07 {
    public static void main(String[] args) {
        Diretor diretor = new Diretor("TOKEN-DIRETOR-2026");
        Cliente cliente = new Cliente("senha123");

        System.out.print("Diretor: ");
        validarAcesso(diretor, "TOKEN-DIRETOR-2026");
        System.out.print("Cliente com senha correta: ");
        validarAcesso(cliente, "senha123");
        System.out.print("Cliente com senha incorreta: ");
        validarAcesso(cliente, "senhaErrada");
    }

    public static void validarAcesso(Autenticavel usuario, String credencial) {
        if (usuario.autenticar(credencial)) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }
    }
}
