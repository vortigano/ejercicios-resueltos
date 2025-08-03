package resueltos.guia3.ej08;

public class EmpleadoAComision extends Empleado {

    private final int SALARIO_MINIMO = 20000;
    private int numeroClientes;
    private int precioCliente;

    public EmpleadoAComision(int numeroClientes, int precioCliente, String DNI, String nombre, String apellido, int añoIngreso) {
        super(DNI, nombre, apellido, añoIngreso);
        this.numeroClientes = numeroClientes;
        this.precioCliente = precioCliente;
    }

    @Override
    public double cobrarSalario() {
        double resultado = numeroClientes * precioCliente;
        if (resultado < SALARIO_MINIMO) {
            resultado = SALARIO_MINIMO;
        }
        return resultado;
    }

    public int getNumeroClientes() {
        return numeroClientes;
    }

}
