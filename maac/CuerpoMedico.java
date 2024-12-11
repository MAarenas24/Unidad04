package com.mycompany.examenunidad04.maac;

/**
 *
 * @author Miguel Angel Arenas Cuevas
 */
public class CuerpoMedico extends UnidadSanitaria {
    
    private static final int NUM_EFECTIVOS = 10;
    
    public CuerpoMedico(String nombre,
            String nacionalidad,
            String ubicacion) {
        
        super(nombre, nacionalidad, ubicacion, NUM_EFECTIVOS);
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
}
