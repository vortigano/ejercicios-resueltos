package resueltos.guia3.ej08;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Empresa emp = new Empresa();
        ArrayList<Empleado> empleados = new ArrayList<>();

        emp.ingresarEmpleado(new EmpleadoAComision(25, 1000, "123", "Valentina", "Pérez", 2020));
        emp.ingresarEmpleado(new EmpleadoAsalariado(50000, 8, "456", "Martín", "López", 2015));

        emp.mostrarSalarios();
        emp.empleadoConMasClientes();
    } 
}
