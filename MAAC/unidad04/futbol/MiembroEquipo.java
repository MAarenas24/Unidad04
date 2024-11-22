package MAAC.unidad04.futbol;

/**
 *
 * @author Miguel Angel Arenas
 */
public abstract class MiembroEquipo {
    private int id;
    private String nombre;
    private String equipo;
    private String apellidos;
    private int edad;
    
    public MiembroEquipo(int id,
            String nombre,
            String equipo,
            String apellidos,
            int edad) {
        
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    //Getter
    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getEquipo() {
        return equipo;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public int getEdad() {
        return edad;
    }
    
    //Setters
    public void setNombre(String apodo) {
        this.nombre = apodo;
    }
    
    public void setEquipo(String nuevoEquipo) {
        equipo = nuevoEquipo;
    }
    //Metodos
    public abstract void concentrarse();
    
    public void viajar() {
        System.out.println(nombre + apellidos + " esta viajando con el equipo " + equipo);
    }
    
}
