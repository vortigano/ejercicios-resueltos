package resueltos.guia3.ej03;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class CartaConNumero extends CartaConPalo {

    private int numero;

    public CartaConNumero(int numero, TipoDePalo palo) {
        super(palo);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero + " de " + getPalo();
    }

    

}