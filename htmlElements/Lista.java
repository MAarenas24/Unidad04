package unidad04.htmlElements;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Lista extends ElementoHTML implements AddElementosHTML {

    public Lista(String id,
            boolean ordenada) {
        super(getTagLista(ordenada), id);
    }

    public Lista(boolean ordenada) {
        this(null, ordenada);
    }

    /**
     * Este metodo dependiendo de si es false o true va a devolver una lista
     * ordenada o no ordenada, tiene static para que en el super le puedas decir
     * el tag que quiere la superclase ya que si no pones el static no se
     * inicializara antes de crear el objeto y no lo podras usar cunado se esta
     * creando
     *
     * @param ordenada indica si es false o true dependiendo de cada uno sera ol
     * o ul
     * @return devuelve el tag
     */
    private static String getTagLista(boolean ordenada) {
        if (ordenada == false) {
            return "ul";
        } else {
            return "ol";
        }
    }

    public void addElemento(ElementoLista elemento) {
        super.tag += elemento;
    }

    public void addElementos(ElementoLista... elementos) {
        for (ElementoLista elemento : elementos) {
            super.tag += elemento;
        }
    }

    @Override
    public void addElemento(ElementoHTML elemento) {
        if (elemento instanceof ElementoLista) {
            contenido += elemento;
        }
    }

    @Override
    public void addElementos(ElementoHTML... elementos) {
        for (ElementoHTML elemento : elementos) {
            if (elemento instanceof ElementoLista) {
                contenido += elemento;
            }

        }
    }
}
