import java.util.ArrayList;

public class TesteQuestao08 {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Rex", 3));
        animais.add(new Gato("Mia", 2));
        animais.add(new Vaca("Mimosa", 5));

        for (Animal animal : animais) {
            System.out.print(animal.getNome() + " (" + animal.getIdade()
                    + " anos): ");
            animal.emitirSom();
        }
    }
}
