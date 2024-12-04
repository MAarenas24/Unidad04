package unidad04.htmlElements;

/**
 * Crea un elemento HTML de parrafo
 * @author Miguel Angel Arenas
 */
public class Parrafo extends ElementoHTML {
    
    public Parrafo(String id, String content) {
        super("p", id, contenidoNotNull(content));
    }
    
    public Parrafo(String content) {
        this(null, content);
    }
    
}
