public class TesteQuestao01 {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro3 = new Livro("O Hobbit", "J. R. R. Tolkien", 59.90);

        livro1.exibirDados();
        livro2.exibirDados();
        livro3.exibirDados();
    }
}
