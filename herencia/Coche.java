package unidad04.herencia;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Coche extends Vehiculo {
    private static final int NUM_RUEDAS = 4;
    
    public Coche(String marca, 
            String modelo, 
            String color,
            double combustible) {
        
        super(marca, modelo, color, NUM_RUEDAS, combustible);
    }
    
}
