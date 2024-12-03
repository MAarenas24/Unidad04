package Unidad04.htmlElements;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Cabecera extends ElementoHTML {
    
    public Cabecera(String id,
            String contenido,
            int nivel) {
        super("h", id, contenido);
//        getNivelValido(nivel);
    }
    
    public Cabecera(String contenido,
            int nivel) {
        this(null, contenido, nivel);
    }
    
    public Cabecera(String contenido) {
        this(null, contenido, 1);
    }
    
//    private int getNivelValido(nivel int) {
//        return 0;
//    }
    
}
