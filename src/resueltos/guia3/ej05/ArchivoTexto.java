package resueltos.guia3.ej05;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ArchivoTexto extends Archivo {

    private String codificacion;
    private String valor;

    public ArchivoTexto(String codificacion, String valor, String nombre, double peso, String localizacion) {
        super(nombre, peso, localizacion);
        this.codificacion = codificacion;
        this.valor = valor;
    }    

    public void cifrar() {
        /* 
            https://es.wikipedia.org/wiki/Cifrado_C%C3%A9sar        
            En criptografía, el cifrado César, también conocido como cifrado por desplazamiento,
            es una de las técnicas de cifrado más simples y más usadas. Es un tipo de cifrado por
            sustitución en el que una letra en el texto original es reemplazada por otra letra que
            se encuentra un número fijo de posiciones más adelante en el alfabeto. Por ejemplo, con
            un desplazamiento de 3, la A sería sustituida por la D
        */
        StringBuilder cifrado = new StringBuilder();
        for (int i = 0; i < valor.length(); i++) {
            cifrado.append((char)(valor.charAt(i) + 1)); // Desplamiento 1: A --> B           
        }
        valor = cifrado.toString();         
    }

    public void descifrar() {
        StringBuilder descifrado = new StringBuilder();
        for (int i = 0; i < valor.length(); i++) {
            descifrado.append((char)(valor.charAt(i) - 1)); // Desplamiento -1: B --> A            
        }
        valor = descifrado.toString();        
    }
    
    public String getValor() {
        return valor;
    }

}