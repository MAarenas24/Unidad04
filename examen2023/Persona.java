
package unidad04.examen2023;

/**
 *
 * @author Miguel Angel Arenas
 */

public abstract class Persona {
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
    
    /**
     * Comprueba q en una cadena de valores determinado se encuentra el valor 
     * introducido como nuevo
     * @param valoresValidos cadena de valores delimitadors
     * @param nuevo el valor a comprobar
     * @return 
     */
    public static boolean valorValido(String valoresValidos, String nuevo) {
        return valoresValidos.contains("#" + nuevo.toLowerCase() + "#");
    }
    
    @Override
    public String toString() {
        return "Persona {"
                + "nombre = " + nombre
                + ", edad = " + edad
                + "}";
    }
    
}
