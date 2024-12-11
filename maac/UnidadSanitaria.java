package com.mycompany.examenunidad04.maac;

/**
 *
 * @author Miguel Angel Arenas Cuevas
 */
public abstract class UnidadSanitaria extends UnidadMilitar implements Operaciones {

    public UnidadSanitaria(String nombre,
            String nacionalidad,
            String ubicacion,
            int tamanio) {
        
        super(nombre, nacionalidad, ubicacion, tamanio);
    }
}
