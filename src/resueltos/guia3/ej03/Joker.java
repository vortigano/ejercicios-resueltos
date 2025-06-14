package resueltos.guia3.ej03;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Joker extends Carta {

    private boolean enColor;

    public Joker(boolean enColor) {
        this.enColor = enColor;
    }

    @Override
    public String toString() {
        return "Joker " + (enColor ? "con" : "sin") + " color";
    }

    
    
    

}