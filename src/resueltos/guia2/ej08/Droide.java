
package resueltos.guia2.ej08;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Droide {
    private ArrayList<Pieza> piezasOperativas;
    private ArrayList<Pieza> piezasNoOperativas;
    private ArrayList<Droide> droidesFueraDeServicio;

    public Droide() {
        this.piezasOperativas = new ArrayList<>();
        this.piezasNoOperativas = new ArrayList<>();
        this.droidesFueraDeServicio = new ArrayList<>();
    }

    public ResultadoReparacion autoRepararse() {
        int i = 0;
        Pieza pieza;
        Pieza piezaOperativa;
        boolean encontreAlMenosUnaPieza = false;

        while (i < this.piezasNoOperativas.size()) {
            pieza = this.piezasNoOperativas.get(i);
            piezaOperativa = this.buscarPiezaOperativa(pieza.getNombre());

            if (piezaOperativa != null) {
                encontreAlMenosUnaPieza = true;
                this.reemplazarPieza(pieza, piezaOperativa);
            } else {
                i++;
            }
        }

        return this.obtenerResultadoReparacion(encontreAlMenosUnaPieza);
    }

    public Pieza buscarPiezaOperativa(String nombrePieza) {
        int i = 0;
        Droide droide;
        Pieza piezaEncontrada = null;

        while (i < this.droidesFueraDeServicio.size() && piezaEncontrada == null) {
            droide = this.droidesFueraDeServicio.get(i);
            piezaEncontrada = droide.obtenerPiezaOperativa(nombrePieza);
            i++;
        }

        return piezaEncontrada;
    }

    private Pieza obtenerPiezaOperativa(String nombrePieza) {
        int i = 0;
        Pieza pieza;
        Pieza piezaEncontrada = null;

        while (i < this.piezasOperativas.size() && piezaEncontrada == null) {
            pieza = this.piezasOperativas.get(i);
            if (pieza.getNombre().equals(nombrePieza)) {
                piezaEncontrada = this.piezasOperativas.remove(i);
            }
            i++;
        }

        return piezaEncontrada;
    }

    private void reemplazarPieza(Pieza piezaNoOperativa, Pieza piezaOperativa) {
        this.piezasNoOperativas.remove(piezaNoOperativa);
        this.piezasOperativas.add(piezaOperativa);
    }

    private ResultadoReparacion obtenerResultadoReparacion(boolean encontreAlMenosUnaPieza) {
        ResultadoReparacion resultado = ResultadoReparacion.REPARACION_IMPOSIBLE;

        if (this.piezasNoOperativas.isEmpty()) {
            resultado = ResultadoReparacion.COMPLETAMENTE_OPERATIVO;
        } else if (encontreAlMenosUnaPieza) {
            resultado = ResultadoReparacion.REPARACION_PARCIAL;
        }

        return resultado;
    }
    
    public void mostrarPiezas(boolean operativas) {
        ArrayList<Pieza> piezas = operativas ? piezasOperativas : piezasNoOperativas;
        for (Pieza pieza : piezas) {
            System.out.print(pieza.getNombre() + ", ");
        }
        System.out.println();
    }

    // Métodos para agregar piezas (no en el diagrama pero necesarios para testing)
    public void agregarPiezaOperativa(Pieza pieza) {
        this.piezasOperativas.add(pieza);
    }

    public void agregarPiezaNoOperativa(Pieza pieza) {
        this.piezasNoOperativas.add(pieza);
    }

    public void agregarDroideFueraDeServicio(Droide droide) {
        this.droidesFueraDeServicio.add(droide);
    }
}