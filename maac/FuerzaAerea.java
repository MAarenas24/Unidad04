package com.mycompany.examenunidad04.maac;

/**
 *
 * @author Miguel Angel Arenas Cueva
 */
public class FuerzaAerea extends UnidadCombate {
    private static final int NUM_EFECTIVOS = 100;
    private final double PORCENTAJE_MAXIMO_BAJAS_EJERCITO = 0.6;
    private final double PORCENTAJE_MAXIMO_BAJAS_AIRE = 0.3;
    
    public FuerzaAerea(String nombre, String nacionalidad) {
        super(nombre, nacionalidad, NUM_EFECTIVOS);
    }
    
    @Override
    public void moverTropas(String destino) {
        if (destino == null) {
            System.out.println("Las tropas no se mueven");
        } else if (destinoValido(destino)) {
            ubicacion = destino;
        } else {
            ubicacion = nacionalidad;
        }
    }

    @Override
    public void moverTropasHacia(UnidadMilitar tropaDestino) {
        if (destinoValido(tropaDestino.ubicacion)) {
            this.ubicacion = tropaDestino.ubicacion;
        }
    }

    @Override
    public void atacar(UnidadMilitar tropaAtacada) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
