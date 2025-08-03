package resueltos.guia3.ej08;

public class EmpleadoAsalariado extends Empleado {
    private double salarioBasico;
    private int antiguedad;

    public EmpleadoAsalariado(double salarioBasico, int antiguedad, String DNI, String nombre, String apellido, int añoIngreso) {
        super(DNI, nombre, apellido, añoIngreso);
        this.salarioBasico = salarioBasico;
        this.antiguedad = antiguedad;
    }
    
    @Override
    public double cobrarSalario() {
        double resultado = salarioBasico;
        if (antiguedad>2 && antiguedad<=5){
            resultado *= 1.05;
        }
        else if (antiguedad>=6 && antiguedad<=10){
            resultado *= 1.10;
        }
        else if (antiguedad>10){
            resultado *= 1.15;
        } 

        return resultado;
    }
}
