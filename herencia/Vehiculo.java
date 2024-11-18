package unidad04.herencia;

/**
 *
 * @author Miguel Angel Arenas
 */
public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    private int numeroRuedas;
    private double combustible;
    private long kmRecorridos;
    
    public Vehiculo(String marca, 
            String modelo, 
            String color, 
            int numeroRuedas,
            double combustible) {
        
        this.kmRecorridos = 0;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numeroRuedas = numeroRuedas;
        this.combustible = combustible;
    }
    
    public Vehiculo(String marca, 
            String modelo,
            int numeroRuedas) {
        
        this(marca, modelo, "Blanco", numeroRuedas, 0);
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setCombustible(double litros) {
        if (litros > 0) {
            combustible += litros;
        }
    }
    
    public void setKmRecorridos(long km) {
        if (km > 0) {
            combustible += km;
        }
    }
    
    public double getCombustible() {
        return combustible;
    }
    
    public long getKmRecorridos() {
        return kmRecorridos;
    }
    
    protected void consumirCombustible(double litrosConsumidos) {
        if (litrosConsumidos > 0) {
            combustible -= litrosConsumidos;
        }
        
        if (combustible < 0) {
            combustible = 0;
        }
        
    }
}
