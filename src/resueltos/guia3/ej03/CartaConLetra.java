package resueltos.guia3.ej03;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class CartaConLetra extends CartaConPalo {

    private char letra;

    public CartaConLetra(char letra, TipoDePalo palo) {
        super(palo);
        this.letra = letra;
    } 
    
    @Override
    public String toString() {
        return letra + " de " + getPalo();
    }

}