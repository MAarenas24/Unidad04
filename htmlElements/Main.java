package unidad04.htmlElements;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Main {
    
    public static void main(String[] args) {
        
        Parrafo p = new Parrafo(null, "Contenido");
        
        System.out.println(p);
        
        Enlace e = new Enlace("e1", "", "");
        
        System.out.println(e);
        
    }
}
