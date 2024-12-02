package unidad04.htmlElements;

/**
 *
 * @author Miguel Angel Arenas
 */
public abstract class ElementoHTML {
    protected String tag;
    protected String id;
    protected String content;
    
    public ElementoHTML(String tag,
            String id,
            String content) {
        this.tag = tag;
        this.id = id;
        this.content = content;
    }
    
    public ElementoHTML(String tag,
            String id) {
        this(tag, id,null);
    }
    
    public ElementoHTML(String tag) {
        this(tag, null);
    }
    
    protected static String contenidoNotNull(String nuevoContenido, String valueIfNull) {
        if (nuevoContenido != null) {
            return nuevoContenido;
        } else {
            return valueIfNull;
        }
    }
    
    protected static String contenidoNotNull(String nuevoContenido) {
        return contenidoNotNull(nuevoContenido, "");
    }
    
    public void setId(String nuevoId) {
        id = nuevoId;
    }
    
    public void setContenido(String contenido) {
        content = contenido;
    }
    
    @Override
    public String toString() {
        String toString = "";
        if (content != null && id != null) {
            toString = "<" + tag + " id = \"" + id + "\">" + content + "</" + tag + ">";
        } else if (content != null && id == null){
            toString = "<" + tag + ">" + content + "</" + tag + ">";
        } else if (content == null && id != null) {
            toString = "<" + tag + " id = \"" + id + "\"/>";
        } else {
            toString = "<" + tag + "/>";
        }
        return toString;
    }
}
