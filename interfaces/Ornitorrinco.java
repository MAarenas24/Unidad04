package unidad04.interfaces;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Ornitorrinco implements ComportamientoAnimal {

    @Override
    public void alimentarse() {
        System.out.println("Come de to'");
    }

    @Override
    public void respirar() {
        System.out.println("Tambien tiene pulmones");
    }

    @Override
    public void reproducirse() {
        System.out.println("Ñaca Ñaca con la ornitorrinca");
    }

    @Override
    public void morir() {
        System.out.println("Levanta la pata");
    }
    
}
