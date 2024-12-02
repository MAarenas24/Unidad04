package Unidad04.ejercicios;

/**
 *
 * @author Miguel Angel Arenas
 */
public abstract class Empleados {
    
    public static final int PLUS = 300;
    
    protected String nombre;
    protected int edad;
    private double salario;
    
    public Empleados(String nombre,
            int edad,
            double salario) {
        
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract void plus();
    
    @Override
    public String toString() {
        return "nombre = " + nombre 
                + ", edad = " + edad 
                + ", salario = " + salario;
    }
    
    
    
}
