
/**
 *
 * @author kvall
 */
public class Circulo extends Formas {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void calcularRadio () {
       
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo de color " + getColor() + " con radio " + radio + "cm");
    }
}










