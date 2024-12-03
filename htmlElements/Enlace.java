package unidad04.htmlElements;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Enlace extends ElementoHTML {

    private String href;

    public Enlace(String id,
            String content,
            String href) {
        super("a", id, contenidoNotNull(content, "link"));
        setHref(href);
    }

    public Enlace(String contenido,
            String href) {
        this(null, contenido, href);
    }
    
    protected static String contenidoNotNull(String nuevoContenido, String valueIfNull) {
        if (nuevoContenido != null || nuevoContenido.equals("")) {
            return nuevoContenido;
        } else {
            return valueIfNull;
        }
    }

    public void setHref(String url) {
        if (url == null || url.equals("")) {
            href = "#";
        } else {
            href = url;
        }
    }

    @Override
    public String toString() {
        String enlace = "";
        if (id == null || id.equals("")) {
            enlace = "<a href = \"" + href + "\" >" + content + "</a>";
        } else {
            enlace = "<a id = \"" + id + "\" href = \"" + href + "\">" + content + "</a>";
        }
        return enlace;
    }
}
