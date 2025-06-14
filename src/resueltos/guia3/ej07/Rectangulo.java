package resueltos.guia3.ej07;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Rectangulo extends Figura {

    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho, String color) {
        super(color);
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double area() {
        return largo * ancho;
    }

    @Override
    public double perimetro() {
        return 2 * largo + 2 * ancho;
    }
    
    

}