package Unidad04.ejercicios;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Rectangle extends Shape {
    
    private double ancho;
    private double altura;
    
    public Rectangle(double ancho, double altura,String color, boolean filled) {
        super(color, filled);
        this.ancho = ancho;
        this.altura = altura;
    }

    public Rectangle(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }
    
    public Rectangle() {
        ancho = 1;
        altura = 1;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getArea() {
        return (ancho * 2) + (altura * 2);
    }
    
    public double getPerimetro() {
        return ancho * altura;
    }
    
    public String toString() {
        return "Soy un rectangulo con base = " + ancho + " y altura = " + altura + ", esta es mi superclase: " + super.toString();
    }
    
}
