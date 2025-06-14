package resueltos.guia3.ej07;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        GrupoDeFiguras gf = new GrupoDeFiguras();
        gf.agregarFigura( new Circunferencia(3, "Rojo") );
        gf.agregarFigura( new TrianguloEquilatero(5, "Verde") );
        gf.agregarFigura( new Rectangulo(2, 6, "Azul") );
        gf.mostrarInfoDeFiguras();
    }

}