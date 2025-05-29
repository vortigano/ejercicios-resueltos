package resueltos.guia3.ej05;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Archivo {

    private String nombre;
    private double peso;
    private String localizacion;
    private boolean abierto;

    public Archivo(String nombre, double peso, String localizacion) {
        // Faltan las validaciones
        this.nombre = nombre;
        this.peso = peso;
        this.localizacion = localizacion;
        this.abierto = false;
    }

    public void abrir() {
        this.abierto = true;
    }

    public void cerrar() {
        if (abierto) {
            this.abierto = false;
        }
    }

    public void mover(String nuevaLocalizacion) {
        if (nuevaLocalizacion != null && !nuevaLocalizacion.isEmpty()) {
            this.localizacion = nuevaLocalizacion;
        }
    }

    public String getLocalizacion() {
        return localizacion;
    }    

    @Override
    public String toString() {
        return "Archivo{" + "nombre=" + nombre + ", peso=" + peso + ", localizacion=" + localizacion + ", abierto=" + abierto + '}';
    }
    
    

}
