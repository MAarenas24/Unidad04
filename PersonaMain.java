package unidad04;

/**
 *
 * @author tarde
 */
public class PersonaMain {
    
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Pepe", "Lopez Sanchez", 45, 1.92);
        System.out.println(p1);

        System.out.println("----------- CLON SUPERFICIAL ---------------");
        Persona clonSuperficial = p1;
        System.out.println(clonSuperficial);
        System.out.println("El clon superficial y el objeto son iguales? " + (p1.equals(clonSuperficial)));
        
        clonSuperficial.setNombre("Jose");
        System.out.println(clonSuperficial);
        
        System.out.println("----------- CLON PROFUNDIDAD ---------------");
        Persona clonProfundidad = p1.clone();
        System.out.println(clonProfundidad);
        System.out.println("El clon profundidad y el objeto son iguales? " + (p1.equals(clonProfundidad)));
        
        p1.setNombre("Anselmo");
        System.out.println("El clon profundidad y el objeto son iguales? " + (p1.equals(clonProfundidad)));
        
        clonProfundidad.setEdad(89);
        System.out.println(clonProfundidad);
        System.out.println(p1);
        
        boolean esInstanciaDe = p1 instanceof Object;
        System.out.println("Persona es de tipo Object? - " + esInstanciaDe);
        
    }
    
}
