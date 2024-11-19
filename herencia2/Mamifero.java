package unidad04.herencia2;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Mamifero extends Animal {
    private int numMamas;

    @Override
    public void alimentarse() {
        System.out.println("Soy mamifero y como");
    }
}
