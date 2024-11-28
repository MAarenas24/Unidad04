
package unidad04.examen2023;

/**
 *
 * @author Miguel Angel Arenas
 */

public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        if (nombre == null) {
            nombre = "Anonimo";
        }
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        if (edad < 0) {
            edad = 0;
        }
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return "Persona {"
                + "nombre = " + nombre
                + ", edad = " + edad
                + "}";
    }
    
}
