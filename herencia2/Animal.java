package unidad04.herencia2;

/**
 *
 * @author Miguel Angel Arenas
 */
public abstract class Animal {
    private double peso;
    private int energia;
    private int edad;
    
    public abstract void alimentarse();
    
    public void descansar() {
        System.out.println("El animal esta descansando");
    }
    
    public void morir() {
        System.out.println("El animal muere");
    }
}
