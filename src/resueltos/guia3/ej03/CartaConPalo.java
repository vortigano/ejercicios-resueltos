package resueltos.guia3.ej03;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class CartaConPalo extends Carta {

    private TipoDePalo palo;

    public CartaConPalo(TipoDePalo palo) {
        this.palo = palo;
    }

    public TipoDePalo getPalo() {
        return palo;
    }    
}