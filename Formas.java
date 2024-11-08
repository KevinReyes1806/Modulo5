
/**
 *
 * @author kvall
 */
import java.util.Scanner;

public abstract class Formas {
    private String color;

    public Formas(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void dibujar();
}
