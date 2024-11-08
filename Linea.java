
/**
 *
 * @author kvall
 */
public class Linea extends Formas {
    private double largo;

    public Linea(String color, double largo) {
        super(color);
        this.largo = largo;
    }

    public double getLargo() {
        return largo;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando una linea de color " + getColor() + " con longitud de" + largo + "cm" );
    }
}
