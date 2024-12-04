package Unidad04.htmlElements;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Main {

    public static void main(String[] args) {

        Parrafo p = new Parrafo("p1", "Contenido");

        System.out.println(p);

        System.out.println("-----------------");

        Enlace e = new Enlace("dsfsdf", "www");

        System.out.println(e);

        System.out.println("------------");

        Cabecera c = new Cabecera("a,sdmaskmdk asmdkasmdka asdmak smk", 7);

        System.out.println(c);

        System.out.println("------------");

        SaltoLinea sl = new SaltoLinea();

        System.out.println(sl);

        System.out.println("------------");

        Imagen i = new Imagen("i1", "aajsdoajdioasj");

        System.out.println(i);
    }
}
