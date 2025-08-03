
package resueltos.guia3.ej08;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;
    
    public Empresa() {
        this.empleados = new ArrayList<>();
    }
    
    public void ingresarEmpleado(Empleado e) {
        empleados.add(e);
    }
    
    public void mostrarSalarios() {
        for (Empleado e : empleados) {
            System.out.println(e.getNombreCompleto() + " cobra $" + e.cobrarSalario());
        }
    }

    public EmpleadoAComision empleadoConMasClientes() {
        EmpleadoAComision mejor = null;

        for (Empleado e : empleados) {
            if (e instanceof EmpleadoAComision) {
                EmpleadoAComision pc = (EmpleadoAComision) e;
                if (mejor == null || pc.getNumeroClientes() > mejor.getNumeroClientes()) {
                    mejor = pc;
                }
            }
        }

        return mejor;
    }
}
