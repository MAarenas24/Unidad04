package unidad04.htmlElements;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Main {
    
    public static void main(String[] args) {
        
        Blockquote b = new Blockquote("adsada", "http://www.worldwildlife.org/who/index.html");
        
        System.out.println(b);
        
        Parrafo p = new Parrafo("ADSADAsdaDSAdASDAsDAsd");
        
        System.out.println(p);
        
        System.out.println("------------------------------");
        imprimirCosas("a", "h", "o", "r", "a", " esto mola", "mogollon");
        System.out.println("------------------------------");
        sumarNumeros(2, 3, 5, 10);
        System.out.println("------------------------------");
        imprimirCualquierCosa("Pepe", 33, false, b);
        
    }
    
    /**
     * funciona varidica con parametros de tipo string
     * @param textos 
     */
    public static void imprimirCosas(String... textos) {
        for (String texto : textos) {
            System.out.print(texto);
        }
        System.out.println();
    }
    
    /**
     * funciona varidica con parametros de tipo int
     * @param numeros 
     */
    public static int sumarNumeros(int... numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        System.out.println("Suma = " + suma);
        
        return suma;
    }
    
    public static void imprimirCualquierCosa(Object... cosas) {
        for (Object cosa : cosas) {
            System.out.println(cosa);
        }
        System.out.println();
    }
}
