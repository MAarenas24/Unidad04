package Unidad04.ejercicios;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Main {
    public static void main(String[] args) {
        
        Shape s = new Shape("negro", true);
        System.out.println(s);
        
        Circle c = new Circle(7, "blanco", true);
        System.out.println(c);
        
        Rectangle r = new Rectangle(7, 5, "purpura", false);
        System.out.println(r);
    }
}
