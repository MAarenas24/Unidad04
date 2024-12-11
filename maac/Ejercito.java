package com.mycompany.examenunidad04.maac;

/**
 *
 * @author Miguel Angel Arenas Cuevas
 */
public class Ejercito extends UnidadCombate {
    private static final int NUM_EFECTIVOS = 500;
    
    public Ejercito(String nombre, String nacionalidad) {
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
    public void atacar(UnidadMilitar tropaAtacada) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void moverTropasHacia(UnidadMilitar tropaDestino) {
        if (destinoValido(tropaDestino.ubicacion)) {
            this.ubicacion = tropaDestino.ubicacion;
        }
    }
}
