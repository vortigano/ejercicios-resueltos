
package resueltos.parciales.drones;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Camara implements Encendible {
    private double consumoXMinGrabacion;

    public Camara(double consumoXMinGrabacion) {
        this.consumoXMinGrabacion = consumoXMinGrabacion;
    }

    public double getConsumoXMinGrabacion() {
        return consumoXMinGrabacion;
    }

    @Override
    public void encender() {
        System.out.println("Camara encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Camara apagada");
    }
    
    
}
