package Unidad04.htmlElements;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Head extends ElementoHTML implements AddElementosHTML {
    
    public Head() {
        super("head", null, "");
    }

    /**
     * Añade contenido solamente si el contenido es de tipo Title
     * @param elemento elemento que se va a añadir
     */
    @Override
    public void addElemento(ElementoHTML elemento) {
        if (elemento instanceof Title) {
            contenido += elemento;
        }
    }

    /**
     * Añade contenido solamente si el contenido es de tipo Title
     * @param elementos elemento que se va a añadir
     */
    @Override
    public void addElementos(ElementoHTML... elementos) {
        for (ElementoHTML elemento : elementos) {
            if (elemento instanceof Title) {
                contenido += elemento;
            }
        }
    }
    
}
