package com.mycompany.examenunidad04.maac;

/**
 *
 * @author Miguel Angel Arenas Cuevas
 */
public abstract class UnidadMilitar {

    private int contadorUnidades;

    static final String ISLAS_STRING = "#UK#Islandia#Chipre#Malta#Madagascar#";
    static final String COSTAS_STRING = "#España#Portugal#Francia#Italia#Alemania#Dinamarca#Noruega#Grecia#";
    static final String INTERIOR_STRING = "#Chequia#Austria#Suiza#Hungría#Serbia#Eslovaquia#";

    protected String nombre;
    protected String nacionalidad;
    protected String ubicacion;
    protected int tamanio;

    public UnidadMilitar(String nombre,
            String nacionalidad,
            String ubicacion,
            int tamanio) {

        setNombre(nombre);
        setNacionalidad(nacionalidad);
        setUbicacion(ubicacion);

        this.tamanio = tamanio;

    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setNombre(String nombre) {
        contadorUnidades++;
        if (nombre == null && nombre.equals("")) {
            this.nombre = "Unidad Militar " + contadorUnidades;
        } else {
            this.nombre = nombre;
        }
    }

    public void setNacionalidad(String nacionalidad) {
        if (nacionalidad == null && nacionalidad.equals("")) {
            this.nacionalidad = "España";
        } else {
            this.nacionalidad = nacionalidad;
        }
    }

    private void setUbicacion(String ubicacion) {
        if (destinoValido(ubicacion)) {
            this.ubicacion = ubicacion;
        } else {
            this.ubicacion = nacionalidad;
        }
    }

    protected void setBajas(int numBajas) {
        if (numBajas < 0) {
            this.tamanio = 0;
        } else {
            numBajas--;
        }
    }

    public boolean destinoValido(String destino) {
        
        if (ISLAS_STRING.contains(destino)) {
            return true;
        }
        
        if (COSTAS_STRING.contains(destino)) {
            return true;
        }
        
        if (INTERIOR_STRING.contains(destino)) {
            return true;
        }
        
        return false;
        
    }

    public abstract void moverTropasHacia(UnidadMilitar tropaDestino);

    public String toString() {
        return "UnidadMilitar {\n"
                + "nombre = " + "\"" + nombre + "\"\n"
                + "nacionalidad = " + "\"" + nacionalidad + "\"\n"
                + "ubicacion = " + "\"" + ubicacion + "\"\n"
                + "tamanio = " + "\"" + tamanio + "\"\n"
                + "}";
    }
}
