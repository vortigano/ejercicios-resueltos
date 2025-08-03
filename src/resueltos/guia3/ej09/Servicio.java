package resueltos.guia3.ej09;

public abstract class Servicio implements Facturable {
    private int cantidadDeHoras;
    
    public Servicio(int cantidadDeHoras) {
        this.cantidadDeHoras = cantidadDeHoras;
    }

    public int getCantidadDeHoras() {
        return cantidadDeHoras;
    }
    
    @Override
    public double precioDeFacturacion() {
        return Matematica.sumarPorcentaje( precio() , IVA / 2);
    }
    
    public double precio() {
        return cantidadDeHoras * valorPorHora();
    }
    
    public abstract double valorPorHora();
}
