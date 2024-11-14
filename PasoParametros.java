package unidad04;

/**
 * 4.1 Paso de parámetros por valor
 * @author tarde
 */
public class PasoParametros {
    
    private static int numero = 3;
    
    public static void main(String[] args) {
        
        int num1 = 6;
        int num2 = 7;
        /**
         * En el paso por valor, se hace unca copia del parametro que se pasa 
         * a la funcion por lo que la variable original no se modifica
         */
        System.out.println("PASO DE PARAMETROS POR VALOR-----------------");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        
        int valorSuma = sumaSorpresa(num1, num2);
        System.out.println("La suma = " + valorSuma);
        
        System.out.println("num1 = " + num1);
        System.out.println("num1 = " + num2);
        /**
         * El paso por referencia, oficialmennte no existe en java, pero si 
         * pasas un objeto como parametro de una funcion, lo que pasa es su
         * referencia, es de cir, la direccion de memoria del objeto
         */
        System.out.println("PASO DE PARAMETROS POR REFERENCIA-----------------");
        Persona p = new Persona("Pepe", "Lopez Sanchez", 45, 1.92);
        System.out.println("Edad persona = " + p.getEdad());
        duplicarEdad(p);
        System.out.println("Edad persona = " + p.getEdad());

    }
    
    /**
     * A los parametros de entrada se les cambiara el valor por sorpresa
     * 
     * @param a primer sumando
     * @param b segundo parametro
     * @return suma de los parametros, con los cambios sorpresa aplicados
     */
    public static int sumaSorpresa(int a, int b) {
        a *= b;
        b -= numero;
        return a + b;
    }
    
    public static void duplicarEdad(Persona p) {
        int edadPersona = p.getEdad();
        p.setEdad(numero * 2);
    }
    
}
