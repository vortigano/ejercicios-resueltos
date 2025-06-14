package resueltos.guia3.ej07;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class GrupoDeFiguras {

    private ArrayList<Figura> figuras;

    public GrupoDeFiguras() {
        this.figuras = new ArrayList<>();
    }   
    
    public void agregarFigura(Figura f) {
        this.figuras.add(f);
    }

    public void mostrarInfoDeFiguras() {
        for (Figura f : figuras) {
            f.mostrar();
        }
    }

}