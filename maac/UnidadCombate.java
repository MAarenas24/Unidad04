package com.mycompany.examenunidad04.maac;

/**
 *
 * @author Miguel Angel Arenas Cuevas
 */
public abstract class UnidadCombate extends UnidadMilitar implements OperacionesMilitares {
    private static final double PORCENTAJE_MAXIMO_BAJAS = 0.2;
    
    public UnidadCombate(String nombre,
            String nacionalidad,
            int tamanio) {
        
        super(nombre, nacionalidad, null, tamanio);
    }
    
    protected void atacar(UnidadMilitar tropaAtacada, double porcentajeMaximoBajas) {
        if (this.nacionalidad.equals(tropaAtacada.nacionalidad)) {
            System.out.println(nombre + " y " + tropaAtacada.nombre 
                    + " son del mismo pais. No van a luchar entre ellas");
        } else if (this.ubicacion.equals(tropaAtacada.ubicacion)) {
            System.out.println(super.nombre + " y " + tropaAtacada.nombre 
                    + " son del mismo pais. No van a luchar entre ellas");
        } else {
            if (tropaAtacada.tamanio <= 0) {
                System.out.println(tropaAtacada.nombre + " no tenia efectios."
                        + " No pueden  entrar en combate");
            } else if (tamanio > (tropaAtacada.tamanio / 2)) {
                System.out.println(nombre + " HA DERROTADO A " + tropaAtacada.nombre);
            } else {
                int efectivosMaximos = (int) (tropaAtacada.tamanio * PORCENTAJE_MAXIMO_BAJAS);
                int numEfectivosMuertos = (int) Math.random() * (efectivosMaximos + 1);
                tropaAtacada.tamanio -= numEfectivosMuertos;
            }
        }
        
    }
    
    public void atacar(UnidadMilitar tropaAtacada) {
        atacar(tropaAtacada, PORCENTAJE_MAXIMO_BAJAS);
    }
    
}
