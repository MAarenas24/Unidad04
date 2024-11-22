package MAAC.unidad04.futbol;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Futbolista extends MiembroEquipo {
    
    private int dorsal;
    /**
     * Posicion del jugador
     */
    private String demarcacion;
    
    public Futbolista(int id,
            String nombre,
            String equipo,
            String apellidos,
            int edad,
            int dorsal,
            String demarcacion) {
        
        super(id, nombre, equipo, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    public int getDorsal() {
        return dorsal;
    }
    
    public void setDorsal(int nuevoDorsal) {
        dorsal = nuevoDorsal;
    }
    
    public String getDemarcacion() {
        return demarcacion;
    }
    
    public void setDemarcacion(String nuevaDemarcacion) {
        demarcacion = nuevaDemarcacion;
    }
    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " - concentracion para futbolistas");
    }
    
    public void jugarPartido() {
        System.out.println(getNombre() + " juega un partido");
    }
    
    public void entrenar() {
        System.out.println(getNombre() + " esta entrenando");
    }
}
