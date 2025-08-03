package resueltos.guia3.ej09;

public class ServicioDeReparacion extends Servicio {
    private final static double PORC_INCR_X_DIF = 25;
    private int dificultad;

    public ServicioDeReparacion(int dificultad, int cantidadDeHoras) {
        super(cantidadDeHoras);
        this.dificultad = dificultad;
    }

    @Override
    public double precio() {
        double precioFinal = super.precio();
        if (this.dificultad > 3) {
            Matematica.sumarPorcentaje(precioFinal, PORC_INCR_X_DIF);
        }
        return precioFinal;
    }

    @Override
    public double valorPorHora() {
        return 180;
    }
    
    
    
    public boolean esSimple() {
        return dificultad < 3;
    }
}
