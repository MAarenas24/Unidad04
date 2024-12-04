package Unidad04.htmlElements;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Cabecera extends ElementoHTML {

    public Cabecera(String id,
            String contenido,
            int nivel) {
        super("h" + getNivelValido(nivel), id, contenido);
    }

    public Cabecera(String contenido,
            int nivel) {
        this(null, contenido, nivel);
    }

    public Cabecera(String contenido) {
        this(null, contenido, 1);
    }

    /**
     * Valida que el nivel es valido del 1 al 6, se pone static porque asi en 
     * el constructor puedo verificarlo si no lo pongo no funcionaria porque
     * al instanciarse un objeto no podria validarlo porque el metodo no esta 
     * estatico lo cual no lo podria ver
     * @param nivel nivel que se va a evaluar para ver si esta correcto
     * @return nivel
     */
    private static int getNivelValido(int nivel) {
        int nivelValido = 0;
        switch (nivel) {
            case 2:
                nivelValido = 2;
                break;
            case 3:
                nivelValido = 3;
                break;
            case 4:
                nivelValido = 4;
                break;
            case 5:
                nivelValido = 5;
                break;
            case 6:
                nivelValido = 6;
                break;
            default:
                nivelValido = 1;
        }
        return nivelValido;
    }
}
