package Unidad04.ejercicios;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Comercial extends Empleados {
    private double comision;
    
    public Comercial(String nombre,
            int edad,
            double salario,
            double comision) {
        
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
            
    @Override
    public void plus() {
        if (getEdad() > 30 && comision > 200) {
            setSalario(getSalario() + PLUS);
        }
    }
    
    @Override
    public String toString() {
        return "Comercial {" 
                + super.toString()
                + ", comision = " + comision
                + "}";
    }
    
}
