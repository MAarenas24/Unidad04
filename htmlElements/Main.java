package Unidad04.htmlElements;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Main {

    public static void main(String[] args) {

//        Parrafo p = new Parrafo("p1", "Contenido");
//
//        System.out.println(p);
//
//        System.out.println("-----------------");
//
//        Enlace e = new Enlace("dsfsdf", "www");
//
//        System.out.println(e);
//
//        System.out.println("------------");
//
//        Cabecera c = new Cabecera("a,sdmaskmdk asmdkasmdka asdmak smk", 7);
//
//        System.out.println(c);
//
//        System.out.println("------------");
//
//        SaltoLinea sl = new SaltoLinea();
//
//        System.out.println(sl);
//
//        System.out.println("------------");
//
//        Imagen i = new Imagen("i1", "aajsdoajdioasj");
//
//        System.out.println(i);
//        
//        System.out.println("-----------------------");
//        ElementoLista el = new ElementoLista("contenido");
//        System.out.println("ElementoLista: " + el);
//        System.out.println("-----------------------");
//        Head h = new Head();
//        System.out.println("Head: " + h);
//        System.out.println("-----------------------");
//        Title t = new Title("Titulo");
//        System.out.println("Title: " + t);
//        System.out.println("-----------------------");
//        Body b = new Body();
//        System.out.println("Body: " + b);
//        
//        System.out.println("----------------------------");
//        System.out.println("----------------------------");
//        
//        Lista l = new Lista(true);
//        
//        System.out.println(l);
//        
//        ElementoLista el1 = new ElementoLista("contenido1");
//        ElementoLista el2 = new ElementoLista("contenido2");
//        
//        l.addElementos(el, el1, el2);
//        
//        System.out.println(l);
        Documento html = new Documento();
        Head head = new Head();
        Body body = new Body();
        Title titulo = new Title("Page title");
        head.addElemento(titulo);
        
        ElementoLista cafe = new ElementoLista("Coffee");
        ElementoLista te = new ElementoLista("Tea");
        ElementoLista leche = new ElementoLista("Milk");
        
        Lista listaDesordenada = new Lista(false);
        Lista listaOrdenada = new Lista(true);
        Cabecera cabeceraDeListaDesordenada = new Cabecera("An Unordered HTML List", 2);
        Cabecera cabeceraDeListaOrdenada = new Cabecera("An Ordered HTML List", 2);
        Imagen img = new Imagen("imagen.jpg");
        
        listaDesordenada.addElementos(cafe, te, leche);
        listaOrdenada.addElementos(cafe, te, leche);
        
        body.addElementos(cabeceraDeListaDesordenada, 
                listaDesordenada, 
                cabeceraDeListaOrdenada, 
                listaOrdenada, 
                img);
        
        html.addElementos(head, body);
        System.out.println(html);
        
    }
}
