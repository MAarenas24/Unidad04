package unidad04.examen2023;

/**
 *
 * @author Miguel Angel Arenas
 */
public final class Presencial extends Alumnado {
    private static final int INCREMENTO_POR_HORA = 6;
    
    private int horas;
    
    public Presencial(String nombre, 
            int edad,
            String idioma,
            String nivel,
            int horas) {
        
        super(nombre, edad, idioma, nivel);
        this.horas= horas;
    }
    
    @Override
    public double pagoMensual() {
        return super.pagoMensual() + INCREMENTO_POR_HORA * horas;
    }
    
}
