package resueltos.guia3.ej05;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Dimension {

    private int ancho;
    private int alto;

    public Dimension(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public String relacionDeAspecto() {
        int mcd = calcularMCD(this.ancho, this.alto);
        int relacionAncho = this.ancho / mcd;
        int relacionAlto = this.alto / mcd;
        return relacionAncho + ":" + relacionAlto;
    }

    /**
     * Método auxiliar para calcular el Máximo Común Divisor (MCD)
     * usando el algoritmo de Euclides
     */
    private int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    

}