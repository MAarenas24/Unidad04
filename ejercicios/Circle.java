package Unidad04.ejercicios;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Circle extends Shape {
    
    private double radius;
    
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle() {
        radius = 1;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    public double getPerimetro() {
        return Math.PI * (radius * 2);
    }
    
    @Override
    public String toString() {
        return "Soy un circulo con radio = " + radius + ", esta es mi superclase: " + super.toString();
    }
    
}
