package resueltos.guia3.ej09;

public class ServicioDeArmado extends Servicio {
    
    public ServicioDeArmado(int cantidadDeHoras) {
        super(cantidadDeHoras);
    }

    @Override
    public double valorPorHora() {
        return 250;
    }
    
    
}
