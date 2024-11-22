package unidad04.ejercicios;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Bebe {

    Bebe(int i) {
        this("Soy un bebé");
        System.out.println("Hola, tengo " + i + "meses");
    }

    Bebe(String s) {
        System.out.println(s);
    }

    void llora() {
        System.out.println("¡¡Buaaaaaaaa!!");
    }

    public static void main(String[] args) {
        new Bebe(8).llora();
    }
}
