
package resueltos.guia2.ej08;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Test {
    public static void main(String[] args) {
        // Crear droides
        Droide droide1 = new Droide();
        Droide droide2 = new Droide();
        Droide droide3 = new Droide();

        // Configurar droide1 (el que se va a autoreparar)
        droide1.agregarPiezaNoOperativa(new Pieza("Motor"));
        droide1.agregarPiezaNoOperativa(new Pieza("Brazo"));
        droide1.agregarPiezaOperativa(new Pieza("CPU"));

        // Configurar droide2 (fuera de servicio con piezas operativas)
        droide2.agregarPiezaOperativa(new Pieza("Motor"));
        droide2.agregarPiezaOperativa(new Pieza("Brazo"));

        // Configurar droide3 (fuera de servicio sin piezas útiles)
        droide3.agregarPiezaOperativa(new Pieza("CPU"));

        // Agregar droides fuera de servicio al droide1
        droide1.agregarDroideFueraDeServicio(droide2);
        droide1.agregarDroideFueraDeServicio(droide3);
        
        // Mostrar estado inicial
        System.out.println("\n=== Estado inicial ===");
        mostrarEstadoDroide("Droide1", droide1);
        mostrarEstadoDroide("Droide2", droide2);
        mostrarEstadoDroide("Droide3", droide3);

        // Intentar autoreparación
        System.out.println("\n=== Autoreparación ===");
        ResultadoReparacion resultado = droide1.autoRepararse();
        System.out.println("\nResultado de la reparación: " + resultado);

        // Mostrar estado final
        System.out.println("\n=== Estado final ===");
        mostrarEstadoDroide("Droide1", droide1);
        mostrarEstadoDroide("Droide2", droide2);
        mostrarEstadoDroide("Droide3", droide3);
    }
    
    private static void mostrarEstadoDroide(String nombre, Droide droide) {
        System.out.print("\n" + nombre + " - Piezas operativas: ");
        droide.mostrarPiezas(true);
        
        System.out.print(nombre + " - Piezas no operativas: ");
        droide.mostrarPiezas(false);
    }
}