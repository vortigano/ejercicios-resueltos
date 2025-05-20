
package resueltos.guia2.ej09;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Garage {
    
    /*
        COMPLETAR CLASE GARAGE SEGUN LO ENUNCIADO
    */
    
    private String codigo;
    private Tablero tablero;
    private ArrayList<Vehiculo> vehiculosEstacionados;
    private ArrayList<Vehiculo> vehiculosRetirados;
    
    public Garage(String codigo) {
        vehiculosEstacionados = new ArrayList<>();
        vehiculosRetirados = new ArrayList<>();
        tablero = new Tablero();
    }
    
    // Refactorear segun enunciado...
    public void estacionarVehiculo(Vehiculo v) {
        
        vehiculosEstacionados.add(v);
    }

    public void mostrarVehiculosSinLlave() {
        for (Vehiculo v : vehiculosEstacionados) {
            if (!tablero.tenesLlaveConEstaPatente(v.getPatente())) {
                System.out.println("Codigo: " + codigo);
                System.out.println(v.getPatente());
            }
        }
    }

}
