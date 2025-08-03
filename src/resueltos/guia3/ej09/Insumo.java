package resueltos.guia3.ej09;

public class Insumo implements Facturable {
    private String nombre;
    private double porcentajeGanancia;
    private double precioLista;
    private TipoDeInsumo tipo;

    public Insumo(String nombre, double porcentajeGanancia, double precioLista, TipoDeInsumo tipo) {
        this.nombre = nombre;
        this.porcentajeGanancia = porcentajeGanancia;
        this.precioLista = precioLista;
        this.tipo = tipo;
    }

    @Override
    public double precioDeFacturacion() {
        return Matematica.sumarPorcentaje(Matematica.sumarPorcentaje(precioLista, porcentajeGanancia), IVA);
    }    
    
}
