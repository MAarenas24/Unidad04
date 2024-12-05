package Unidad04.htmlElements;

/**
 *
 * @author Miguel Angel Arenas
 */
public class ElementoLista extends ElementoHTML {
    
    public ElementoLista(String id, String contenido) {
        super("li", id, contenido);
    }

    public ElementoLista(String contenido) {
        this(null, contenido);
    }
}
