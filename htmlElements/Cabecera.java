package unidad04.htmlElements;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Cabecera extends ElementoHTML {
    
    public Cabecera(String id,
            String contenido,
            int nivel) {
        super("h" + nivel, id, contenido);
        getNivelValido(nivel);
    }
    
    public Cabecera(String contenido,
            int nivel) {
        this(null, contenido, nivel);
    }
    
    public Cabecera(String contenido) {
        this(null, contenido, 1);
    }
    
    private int getNivelValido(int nivel) {
        return nivel;
    }
}
