package unidad04.htmlElements;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Parrafo extends ElementoHTML {
    
    public Parrafo(String content) {
        super("p", content);
    }
    
    @Override
    public String toString() {
        return "<p>" + content + "</p>";
    }
    
}
