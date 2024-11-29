package unidad04.htmlElements;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Enlace extends ElementoHTML {
    private String href;
    
    public Enlace(String content,
            String enlace) {
        super("a", content);
        this.href = enlace;
    }
    
    @Override
    public String toString() {
        return "";
    }
}
