package com.mycompany.examenunidad04.maac;

/**
 *
 * @author Miguel Angel Arenas Cuevas
 */
public class Main {
    
    public static void main(String[] args) {
        
        Ejercito e = new Ejercito("pepe", null);
        
        e.destinoValido("Portugal");
        
        CuerpoMedico cp = new CuerpoMedico("pepe", "Francia", null);
        
        Marina m = new Marina("asndjai", null);
        
        System.out.println(e);
        
        e.moverTropasHacia(m);
        
        System.out.println(e);
    }
    
}
