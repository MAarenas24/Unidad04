package Unidad04.ejercicios;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Shape {
    
    private String color = "red";
    private boolean filled = true;
    
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public Shape() {
        color = "Verde";
        filled = true;
    }
    
    public String getColor() {
        return color;
    }
    
    public boolean getFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public String toString() {
        return "Shape {"
                + "color = " + color
                + ", filled = " + filled
                + "}";
    }
}
