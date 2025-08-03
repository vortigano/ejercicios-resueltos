package resueltos.guia3.ej09;

import java.util.ArrayList;

public class Comercio {
    private ArrayList<Facturable> facturables;
    
    public Comercio() {
        this.facturables = new ArrayList<>();
    }
    
    public void realizarServicio(Facturable e) {
        facturables.add(e);
    }
    
    public void montoTotalFacturado() {
        double montoTotal = 0;
        for (Facturable a : facturables) {
            montoTotal += a.precioDeFacturacion();
        }
        System.out.println("El monto total facturado es: " + montoTotal);
    }
    
    public void cantidadServiciosSimples() {
        int contador = 0;
        for (Facturable a : facturables) {
            if (a instanceof ServicioDeReparacion sdr && sdr.esSimple()) {                
                contador++;
            }
        }
        System.out.println("Cantidad de servicio simples: " + contador);
    }
}
