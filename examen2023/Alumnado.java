package unidad04.examen2023;

/**
 *
 * @author Miguel Angel Arenas
 */
public abstract class Alumnado extends Persona implements Estudiante {

    private static final double CUOTA_FIJA = 90;
    
    public static final String A1 = "A1";
    public static final String A2 = "A2";
    public static final String B1 = "B1";
    public static final String B2 = "B2";
    public static final String C1 = "C1";
    public static final String C2 = "C2";
    
    private String idioma;
    private String nivel;
    
    public Alumnado(String nombre, 
            int edad,
            String idioma,
            String nivel) {
        
        super(nombre, edad);
        setNivel(idioma);
        this.nivel = nivel;
    }
    
    public String getIdioma() {
        return idioma;
    }
    
    public String getNivel() {
        return nivel;
    }
    
    
    public static String getValoresValidos() {
        return "#" + A1
                + "#" + A2
                + "#" + B1
                + "#" + B2
                + "#" + C1
                + "#" + C2
                + "#";
    }
    
    private void setNivel(String nivel) {
        if (valorValido(getValoresValidos(), nivel)) {
            idioma = nivel;
        } else {
            idioma = "No asignado";
        }
    }
    
    @Override
    public double pagoMensual() {
        return CUOTA_FIJA;
    }
    
    @Override
    public String toString() {
        return "Alumnado {" + super.toString() 
                + ", idioma = " + idioma 
                + ", nivel = " + nivel
                + "}";
    }
    
}
