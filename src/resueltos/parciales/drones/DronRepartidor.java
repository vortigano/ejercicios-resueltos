
package resueltos.parciales.drones;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class DronRepartidor extends Dron {
    
    private static final int MINUTOS_SOBREVUELO = 10;
    private double capMaxCarga;
    private Paquete paquete;

    public DronRepartidor(double capMaxCarga, String id, double bateriaActual, double consumoPorMinuto, double consumoPorKm) {
        super(id, bateriaActual, consumoPorMinuto, consumoPorKm);
        this.capMaxCarga = capMaxCarga;
        this.paquete = null;
    }

    @Override
    public boolean aceptaMision(double distancia, double valorAdicional, TipoDeMision tdm) {
        return tdm == TipoDeMision.ENVIO && capMaxCarga >= valorAdicional && alcanzaBateria(distancia, MINUTOS_SOBREVUELO);
    }
    
    

}
