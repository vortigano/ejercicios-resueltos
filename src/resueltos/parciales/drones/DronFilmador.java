
package resueltos.parciales.drones;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class DronFilmador extends Dron {
    
    private Camara camara;

    public DronFilmador(Camara camara, String id, double bateriaActual, double consumoPorMinuto, double consumoPorKm) {
        super(id, bateriaActual, consumoPorMinuto, consumoPorKm);
        this.camara = camara;
    }

    @Override
    public boolean aceptaMision(double distancia, double valorAdicional, TipoDeMision tdm) {
        return tdm == TipoDeMision.FILMACION && alcanzaBateria(distancia, valorAdicional * camara.getConsumoXMinGrabacion());
    }

    @Override
    public void apagar() {
        camara.apagar();
        super.apagar();        
    }

    
}
