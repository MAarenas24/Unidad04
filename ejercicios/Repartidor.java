package Unidad04.ejercicios;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Repartidor extends Empleados {
    private String zona;
    
    public Repartidor(String nombre,
            int edad,
            double salario,
            String zona) {
        
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    @Override
    public void plus() {
        if (getEdad() < 25 && zona.equals("zona 3")) {
            setSalario(getSalario() + PLUS);
        }
    }
    
    @Override
    public String toString() {
        return "Repartidor {"
                + super.toString()
                + ", zona = " + zona
                + "}";
    }
    
}
