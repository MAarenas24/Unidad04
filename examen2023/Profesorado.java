package unidad04.examen2023;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Profesorado extends Persona {
    public static final String INGLES = "inglés";
    public static final String FRANCES = "francés";
    public static final String ALEMAN = "alemnán";
    private String idioma;
    
    public Profesorado(String nombre, int edad, String idioma) {
        super(nombre, edad);
        cambiarIdioma(idioma);
    }
    
    public String getIdioma() {
        return idioma;
    }
    
    public void cambiarIdioma(String nuevo) {
        /*
        if (nuevo.equals(INGLES) || nuevo.equals(FRANCES) || nuevo.equals(ALEMAN)) {
            idioma = nuevo;
        } else {
            idioma = "No Asignado";
        }
        */
        
        if (valorValido(getIdiomasValidos(), nuevo)) {
            idioma = nuevo;
        } else {
            idioma = "No asignado";
        }
    }
    
    public static String getIdiomasValidos() {
        return "#" + INGLES + "#" + FRANCES + "#" + ALEMAN + "#";
    } 
    
    public Profesorado clone() {
        return new Profesorado(getNombre(), getEdad(), idioma);
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Idioma = " + idioma;
    }
    
    
    
}
