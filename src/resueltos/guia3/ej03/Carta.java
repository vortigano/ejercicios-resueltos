package resueltos.guia3.ej03;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Carta {

    private boolean deFrente;

    public Carta() {
        this.deFrente = true;
    }

    public void darVuelta() {
        deFrente = !deFrente;
    }

    public void mostrar() {
        if (deFrente) {
            System.out.println(toString());
        } else {
            System.out.println("**********");
        }
    }

}