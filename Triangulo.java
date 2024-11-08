
/**
 *
 * @author kvall
 */
public class Triangulo extends Formas {
    private double angulo;

    public Triangulo(String color, double angulo) {
        super(color);
        this.angulo = angulo;
    }

    public double getAngulo() {
        return angulo;
    }

    public void calcularArea() {

    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triangulo de color " + getColor() + " con angulo " + angulo);
    }
}
