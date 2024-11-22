package MAAC.unidad04.futbol;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Main {
    
    public static void main(String[] args) {
        
        Futbolista maradona = new Futbolista(0, "Diego Armando", "Barcelona", "Maradona", 30, 10, "Delantero");
        
        maradona.concentrarse();
        
        System.out.println(maradona.getApellidos());
        System.out.println(maradona.getEquipo());
        
    }
    
}
