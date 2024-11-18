package unidad04.interfaces;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Lobo implements ComportamientoAnimal {

    @Override
    public void alimentarse() {
        System.out.println("El lobo come carne");
    }

    @Override
    public void respirar() {
        System.out.println("Por los pulmones");
    }

    @Override
    public void reproducirse() {
        System.out.println("Ñaca Ñaca con loba");
    }

    @Override
    public void morir() {
        System.out.println("Estira la pata");
    }
    
}
