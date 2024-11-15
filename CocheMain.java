package unidad04;

/**
 * 5.3 Constructor copia
 * @author Miguel Angel Arenas
 */
public class CocheMain {
     public static void main(String[] args) {
        Coche c1 = new Coche("Nissan", 120, "1111-AAAA");
        System.out.println("c1 = " + c1);
        
        Coche c2 = new Coche(c1);
        System.out.println("c2 = " + c2);
         
        Coche c3 = new Coche(c1, "3333-CCCC");
        System.out.println("c3 = " + c3);
        
        c3 = null;
    }
}
