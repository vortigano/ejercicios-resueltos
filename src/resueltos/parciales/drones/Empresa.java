package resueltos.parciales.drones;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Empresa {

    private ArrayList<Dron> drones;

    public Empresa() {
        this.drones = new ArrayList<>();    
    }   
    
    /**
     * Agrega un nuevo dron a la flota de la empresa
     * @param d El dron a agregar
     */
    public void agregarDron(Dron d) {
        this.drones.add(d);
    }

    /**
     * 
     * @param distancia expresada en km.
     * @param paq el paquete a entregar, para una misión de ENVÍO
     * @return el Dron con mayor nivel de batería que pueda aceptar la misión encomendada.
     */
    public Dron elegirDron(double distancia, Paquete paq) {
        return elegirDron(distancia, paq.getPeso(), TipoDeMision.ENVIO);
    }

    /**
     * 
     * @param distancia expresada en km.
     * @param minutosDeFilmacion para una misión de FILMACION
     * @return el Dron con mayor nivel de batería que pueda aceptar la misión encomendada.
     */
    public Dron elegirDron(double distancia, double minutosDeFilmacion) {
        return elegirDron(distancia, minutosDeFilmacion, TipoDeMision.FILMACION);
    }
    
    private Dron elegirDron(double distancia, double valor, TipoDeMision tipoDeMision) {
        Dron max = null;
        double batMax = -1;
        for (Dron dron : drones) {
            if (dron.aceptaMision(distancia, valor, tipoDeMision) && dron.getBateriaActual() > batMax) {
                batMax = dron.getBateriaActual();
                max = dron;
            }            
        }
        return max;
    }
    
    /**
     * Debe apagar a todos los Drones.
     */
    public void apagarDrones() {
        for (Dron dron : drones) {
            dron.apagar();
        }
    }

}