package Unidad04.htmlElements;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Body extends ElementoHTML implements AddElementosHTML {
    
    public Body() {
        super("body", null, "");
    }

    /**
     * Añade contenido solamente si el contenido es de tipo HTML
     * @param elemento elemento que se va a añadir
     */
    @Override
    public void addElemento(ElementoHTML elemento) {
        if (elemento instanceof ElementoHTML) {
            contenido += elemento;
        }
    }

    /**
     * Añade contenido solamente si el contenido es de tipo HTML
     * @param elementos elemento que se va a añadir
     */
    @Override
    public void addElementos(ElementoHTML... elementos) {
        for (ElementoHTML elemento : elementos) {
            if (elemento instanceof ElementoHTML) {
                contenido += elemento;
            }
        }
    }
    
}
