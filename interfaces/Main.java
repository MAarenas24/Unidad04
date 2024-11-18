package unidad04.interfaces;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Main {
    
    public static void main(String[] args) {
        
        ComportamientoAnimal loboComun = new Lobo();
        ComportamientoAnimal perry = new Ornitorrinco();
        
        loboComun.alimentarse();
        loboComun.respirar();
        loboComun.reproducirse();
        loboComun.morir();
        
        System.out.println("----------");
        
        perry.alimentarse();
        perry.respirar();
        perry.reproducirse();
        perry.morir();
            
        if (loboComun instanceof Lobo) {
            System.out.println("loboComun es un Lobo");
        } else {
            System.out.println("NOOOOOOOO es un Lobo");
        }
        
        if (perry instanceof Ornitorrinco) {
            System.out.println("perry es un Ornitorrinco");
        }
        
        if (loboComun instanceof ComportamientoAnimal) {
            System.out.println("loboComun implementa ComportamientoAnimal");
        }
    }
    
}
