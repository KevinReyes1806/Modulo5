
/**
 *
 * @author kvall
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero del tipo de forma\n1.circulo\n2.linea\n3.triangulo\n4.cuadrado: ");
        String tipo = scanner.nextLine();

        System.out.println("Ingrese el color de la forma: ");
        String color = scanner.nextLine();

        Formas forma = null;

        switch (tipo.toLowerCase()) {
            case "1":
                System.out.println("Ingrese el radio del circulo: ");
                double radio = scanner.nextDouble();
                forma = new Circulo(color, radio);
                break;
            case "2":
                System.out.println("Ingrese el largo de la linea: ");
                double largo = scanner.nextDouble();
                forma = new Linea(color, largo);
                break;
            case "3":
                System.out.println("Ingrese el angulo del triangulo: ");
                double angulo = scanner.nextDouble();
                forma = new Triangulo(color, angulo);
                break;
            case "4":
                System.out.println("Ingrese el area del cuadrado: ");
                double area = scanner.nextDouble();
                forma = new Cuadrado(color, area);
                break;
            default:
                System.out.println("No reconocido!!");
                break;
        }

        if (forma != null) {
            forma.dibujar();
        }

        scanner.close();
    }
}
