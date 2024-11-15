package unidad04;

/**
 * 5.3 Constructor copia
 * @author Miguel Angel Arenas
 */
public class Coche {
    private String marca;
    private int caballos;
    private String color;
    private String matricula;
    
    public Coche(String marca, int caballos, String matricula, String color) {
        this.marca = marca;
        this.caballos = caballos;
        this.color = color;
        this.matricula = matricula;
    }
    
    public Coche(String marca, int caballos, String matricula) {
        this(marca, caballos, matricula, "Blanco");
    }
    
    /**
     * Se puede inicializar los atribuutos 1 a 1 (comentado) o se puede usar el
     * constructor con todos los parametros
     * 
     * @param c  
     */
    public Coche(Coche c) {
        /*
        this.marca = c.marca;
        this.caballos = c.caballos;
        this.color = c.color;
        */
        this(c.marca, c.caballos, "", c.color);
    }
    
    
    public Coche(Coche c, String matricula) {
        this(c.marca, c.caballos, matricula, c.color);

    }
    
    public String toString() {
        return "Coche {"
                + "Marca: " + marca
                + ", Caballos: " + caballos
                + ", Matricula: " + matricula
                + ", Color: " + color
                + "}";
    }
    
}
