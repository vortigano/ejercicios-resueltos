package resueltos.parciales.drones;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Dron implements Encendible {

    private String id;
    private double bateriaActual;
    private double consumoPorMinuto;
    private double consumoPorKm;
    private boolean encendido;

    public Dron(String id, double bateriaActual, double consumoPorMinuto, double consumoPorKm) {
        // Debería llamar a cada setter con su validación, pero lo omitimos para simplificar la solución.
        this.id = id;
        this.bateriaActual = bateriaActual; // Entre 1 y 100
        this.consumoPorMinuto = consumoPorMinuto;
        this.consumoPorKm = consumoPorKm;
    }    

    public double getBateriaActual() {
        return bateriaActual;
    }
    
    public double bateriaSegunTiempo(double tiempoEnMinutos) {
        return consumoPorMinuto * tiempoEnMinutos;
    }
    
    public double bateriaSegunDistancia(double distancia) {
        return consumoPorKm * distancia * 2;
    }
    
    public boolean alcanzaBateria (double distancia, double tiempoEnMinutos) {
        return bateriaActual > bateriaSegunDistancia(distancia) + bateriaSegunTiempo(tiempoEnMinutos);
    }

    public abstract boolean aceptaMision(double distancia, double valorAdicional, TipoDeMision tdm);
    

    @Override
    public void encender() {
        System.out.printf("Dron %s encendido", id);
        encendido = true;
    }

    @Override
    public void apagar() {
        System.out.printf("Dron %s apagado", id);
        encendido = false;
    }
    
    
    
}