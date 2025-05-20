
package resueltos.guia2.ej09;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class FooParking {
    
    /*
        COMPLETAR CLASE FOOPARKING SEGUN LO ENUNCIADO
    */
    
    private ArrayList<Garage> garages;
    
    public FooParking() {
        garages = new ArrayList<>();
    }
    
    
    public ArrayList<Informe> obtenerInformeEstadoGarages() {
        return null;
    }
    
    public void mostrarVehiculosSinLlave() {
        for (Garage garage : garages) {
            garage.mostrarVehiculosSinLlave();
        }
    }
}
