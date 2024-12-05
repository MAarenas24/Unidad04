package Unidad04.htmlElements;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Documento extends ElementoHTML implements AddElementosHTML {

    public Documento() {
        super("html", null, "");
    }

    /**
     * me falta hacerlo
     */
    public void setContenido() {
        
    }

    /**
     * Añade contenido solamente si el contenido es de tipo Head y Body
     * @param elemento elemento que se va a añadir
     */
    @Override
    public void addElemento(ElementoHTML elemento) {
        if (elemento instanceof Head) {
            contenido += elemento;
        } else if (elemento instanceof Body) {
            contenido += elemento;
        }
    }

    /**
     * Añade contenido solamente si el contenido es de tipo Head y Body
     * @param elementos elemento que se va a añadir
     */
    @Override
    public void addElementos(ElementoHTML... elementos) {
        for (ElementoHTML elemento : elementos) {
            if (elemento instanceof Head) {
                contenido += elemento;
            } else if (elemento instanceof Body) {
                contenido += elemento;
            }
        }

    }

}
