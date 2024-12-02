package unidad04.htmlElements;

/**
 *
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
