package resueltos.guia3.ej07;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Figura {

    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    public abstract double area();
    public abstract double perimetro();

    public void mostrar() {
        System.out.println(getColor());
        System.out.println(area());
        System.out.println(perimetro());
    }

}