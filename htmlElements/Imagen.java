package unidad04.htmlElements;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Imagen extends ElementoHTML {
    private String src;
    
    public Imagen(String id,
            String src) {
        
        super("img", id);
        this.src = src;
    }
    
    public Imagen(String src) {
        this(null, src);
    }
    
    public void setSrc(String src) {
        this.src = src;
    }
    
    @Override
    public String toString() {
        String enlace = "";
        if (id == null || id.equals("")) {
            enlace = "<img src = \"" + src + "\" />";
        } else {
            enlace = "<img id = \"" + id + "\" src = \"" + src + "\" />";
        }
        return enlace;
    }
    
}
