package Unidad04.htmlElements;

/**
 * Crea 
 * @author Miguel Angel Arenas
 */
public abstract class ElementoHTML {
    /**
     * La etiqueta del elemento que quieras leer
     */
    protected String tag;
    /**
     * El id que quieras meterle a la etiqueta
     */
    protected String id;
    /**
     * El contenido que quieras meterle a la etiqueta
     */
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
    
    /**
     * Valida que el contenido no sea null y si es null lo modifica el contenido
     * a lo que le hayas pasado como parametro
     * @param nuevoContenido el contenido que va a evaluar si es null
     * @param valueIfNull el contenido que va a devolver si es null
     * @return devuelve un contenido que no sea null
     */
    protected static String contenidoNotNull(String nuevoContenido, String valueIfNull) {
        if (nuevoContenido != null) {
            return nuevoContenido;
        } else {
            return valueIfNull;
        }
    }
    
    /**
     * Lo mismo que el metodo de arriba contenidoNotNull pero este si no le 
     * pasas el segundo parametro si es null el contenido se va a devolver una 
     * cadena vacia ""
     * @param nuevoContenido parametro que se va a evaluar si es null o no
     * @return devuelve el contenido
     */
    protected static String contenidoNotNull(String nuevoContenido) {
        return contenidoNotNull(nuevoContenido, "");
    }
    
    /**
     * permite cambiar el id a un elementoHTML
     * @param nuevoId el nuevo id que se va a poner
     */
    public void setId(String nuevoId) {
        id = nuevoId;
    }
    
    /**
     * permite cambiar el contenido de un elementoHTML
     * @param contenido el nuevo id que se va a poner
     */
    public void setContenido(String contenido) {
        content = contenido;
    }
    
    /**
     * muestra el elementoHTML
     * @return 
     */
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
