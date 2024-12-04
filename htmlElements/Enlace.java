package unidad04.htmlElements;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Enlace extends ElementoHTML {

    /**
     * La direccion del enlace
     */
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

    /**
     * Comprueba q el contenido no sea null
     *
     * @param nuevoContenido el contenido que va a evaluar
     * @param valueIfNull el contenido que va a ser si el contenido es null
     * @return devulve el contenido
     */
    protected static String contenidoNotNull(String nuevoContenido, String valueIfNull) {
        if (nuevoContenido != null || nuevoContenido.equals("")) {
            return nuevoContenido;
        } else {
            return valueIfNull;
        }
    }

    /**
     * modifica el url y comprueba q tenga si no tiene se pone un #
     *
     * @param url el url nuevo
     */
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
            enlace = "<a href = \"" + href + "\" >" + "link" + "</a>";
        } else {
            enlace = "<a id = \"" + id + "\" href = \"" + href + "\">link</a>";
        }

        return enlace;
    }
}
