package resueltos.guia3.ej08;

public abstract class Empleado {

    private String DNI;
    private String nombre;
    private String apellido;
    private int añoIngreso;

    public Empleado(String DNI, String nombre, String apellido, int añoIngreso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.añoIngreso = añoIngreso;
    }
    
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public abstract double cobrarSalario(); // Contrato hacia las subclases
}
