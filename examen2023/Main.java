package unidad04.examen2023;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Main {
    
    public static void main(String[] args) {
        Profesorado pro1 = new Profesorado("Pepe", -25, "Español");
        Profesorado pro2 = pro1.clone();
        
        pro1.cambiarIdioma("inglÉs");
        
        System.out.println(pro1.toString());
        
        System.out.println(pro2.toString());
        
//        Alumnado a1 = new Alumnado("Alumnado", 25, "inglés", "C2");
//        System.out.println(a1.pagoMensual());
        Presencial pres = new Presencial("Presencial", 25, "inglés", "C2", 10);
        
        
        System.out.println(pres.pagoMensual());
    }
    
}
