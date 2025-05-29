package resueltos.guia3.ej05;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ArchivoVideo extends ArchivoMultimedia {

    private FormatoVideo formato;
    private Dimension dimension;

    public ArchivoVideo(FormatoVideo formato, int ancho, int alto, int duracion, String nombre, double peso, String localizacion) {
        super(duracion, nombre, peso, localizacion);
        this.formato = formato;
        this.dimension = new Dimension(ancho, alto);
    }
    
    public String relacionDeAspecto() {
        return dimension.relacionDeAspecto();
    }
}