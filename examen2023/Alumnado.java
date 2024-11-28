package unidad04.examen2023;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Alumnado extends Persona implements Estudiante {

    private String idioma;
    private String nivel;
    
    public Alumnado(String nombre, 
            int edad,
            String idioma,
            String nivel) {
        
        super(nombre, edad);
        cambiarIdioma(idioma);
        this.nivel = nivel;
    }
    
    public String getIdioma() {
        return idioma;
    }
    
    public String getNivel() {
        return nivel;
    }
    
    public void cambiarIdioma(String idioma) {       
        if (Profesorado.idiomaValido(idioma)) {
            this.idioma = idioma;
        } else {
            this.idioma = "No asignado";
        }
    }
    
    
    
    @Override
    public double pagoMensual() {
        return 0.0;
    }
    
}
