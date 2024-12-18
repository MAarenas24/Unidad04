package unidad04.herencia;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Moto extends Vehiculo {
    private static final double LITROS_POR_KM = 0.02;
    private static final double CAPACIDAD_MINIMA = 10;
    private double capacidadDeposito;
    
    public Moto(String marca, 
            String modelo, 
            String color, 
            int numeroRuedas,
            double combustible,
            double capacidadDeposito) {
        
        super(marca, modelo, color, numeroRuedas, combustible);
        this.capacidadDeposito = capacidadDeposito;
    }
    
    public Moto(String marca,
            String modelo) {
        
        this(marca, modelo, "Blanco", 2, 0, CAPACIDAD_MINIMA);
    }
    
    public void printMarca() {
        System.out.println("Marca: " + getMarca());
    }
    
    public void recorrer(int kmRecorridos) {
        if (kmRecorridos > 0) {
            double combustibleConsumido = LITROS_POR_KM * kmRecorridos;
            consumirCombustible(combustibleConsumido);
        }
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass().getName().equals(o.getClass().getName())) {
            return false;
        }
        Moto moto = (Moto) o;
        
        if (this.marca.equals(moto.marca)) {
            return false;
        }
        
        if (this.modelo.equals(moto.modelo)) {
            return false;
        }
        
        return true;
    }
}
